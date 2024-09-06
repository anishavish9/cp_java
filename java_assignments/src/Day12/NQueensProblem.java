package Day12;

public class NQueensProblem {

	final int N = 4;
    void print(int board[][]) {
        for(int i=0;i<N;i++) {
            for(int j =0;j<N;j++)
                System.out.print(""+ board[i][j]+" ");
            System.out.println(" ");
        }
    }
    
    boolean isSafe(int board[][], int r, int c) {
        // Check the row on the left side
        for (int i = 0; i < c; i++) {
            if (board[r][i] == 1)
                return false;
        }

        // Check upper diagonal on the left side
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // Check lower diagonal on the left side
        for (int i = r, j = c; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    boolean solveNQUtil(int board[][],int c) {
        if(c>=N)
        	return true;
        for(int i=0;i<N;i++) {
            if (isSafe(board, i, c)) {
                board[i][c] = 1;
                if (solveNQUtil(board, c + 1))
                    return true;
                board[i][c] =0 ; // Back tracking
            }
        }
        return false;
    }
    boolean solveNQ() {
        int board[][] = new int[N][N];
          if(!solveNQUtil(board,0)) {
              System.out.println("Solution not found");
              return false;
          }
        print(board);
        return true;
    }
    
    public static void main(String args[]) {
    	NQueensProblem obj = new NQueensProblem();
        obj.solveNQ();
    }


}
