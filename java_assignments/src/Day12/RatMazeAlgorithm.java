package Day12;

import java.util.ArrayList;
import java.util.List;

public class RatMazeAlgorithm {

	static String direction = "DLRU";
	//possible combination of x-y move 
	static int[] dx = {1,0,0,-1};
	static int[] dy = {0,-1,1,0};

	public static boolean isValid(int x, int y, int n, int[][] maze) {
		return x>=0 && y>=0  && x<n && y<n && maze[x][y]==1;
	}


	public static void findPath(
			int x, int y, int n, int[][] maze, List<String> res, StringBuilder sb
			) {
		if(x == n-1 && y ==n-1) {
			res.add(sb.toString());
			return;
		}
		maze[x][y] =0 ;
		for(int i=0;i<n-1;i++) {
			int nextx = x + dx[i];
			int nexty = y + dy[i];
			if(isValid(nextx,nexty,n,maze)) {
				System.out.println("path append ------"+ sb.append(direction.charAt(i)));

				//sb.append(direction.charAt(i)); // appending sb(currentpath)
				findPath(nextx,nexty,n,maze,res,sb); // calling the findPath()
				
				System.out.println("path delete------"+sb.deleteCharAt(sb.length()-1));
				//sb.deleteCharAt(sb.length()-1);// backtracking
			}
		}
		maze[x][y]= 1;
	}

	public static void main(String args[]) {
		int maze[][] = {{1,0,0,0},
				{1,1,0,1},
				{1,1,0,0},
				{0,1,1,1}};
		int n = maze.length;
		List<String> res = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		if(maze[0][0]!=0 && maze[n-1][n-1] !=0) {
			findPath(0,0,n,maze,res,sb);
		}

		if(res.isEmpty()) { 
			System.out.println(-1-1);
		}
		else {
			for(String p : res) {
				System.out.println(p+ " ");
			} 
			System.out.println(" ");
		}
	}
	
}
