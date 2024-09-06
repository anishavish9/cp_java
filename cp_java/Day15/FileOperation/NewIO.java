package FileOperation;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NewIO {

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("D://files//names.txt","r");
		FileChannel channel = file.getChannel();  //provide interface to randomaccessfile for manipulating files
		ByteBuffer buf = ByteBuffer.allocate(1824);
		int r;
		while((r = channel.read(buf))!=-1)
			buf.flip();
			while(buf.hasRemaining()) {
				System.out.print((char)buf.get());
		}
	
		buf.clear();
	}

}
