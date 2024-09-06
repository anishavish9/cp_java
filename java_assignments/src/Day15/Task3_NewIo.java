/*
 * Task 3: New IO (NIO)
Use NIO Channels and Buffers to read content from a file and write to another file.
 */

package Day15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Task3_NewIo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("/home/rps/Documents//files//names.txt","r");
		FileChannel channel = file.getChannel();  //provide interface to randomaccessfile for manipulating files
		ByteBuffer buf = ByteBuffer.allocate(1824);
		int r;
		while((r = channel.read(buf))!=-1)
			buf.flip();
			while(buf.hasRemaining()) {
				System.out.print((char)buf.get());
		}
		buf.rewind();//puting pointer to start 
		FileOutputStream file2 = new FileOutputStream("/home/rps/Documents//files//name2.txt");
		FileChannel filechannel2 = file2.getChannel();
		while(buf.hasRemaining()) {
			filechannel2.write(buf);
		}
		buf.clear();
	}
}
