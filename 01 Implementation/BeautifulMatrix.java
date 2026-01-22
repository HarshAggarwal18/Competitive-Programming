
import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]mat = new int[5][5];
        int row = -1, col = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int val = sc.nextInt();
                mat[i][j] = val;
                if (val == 1) {
                    row = i;
                    col = j;
                }
                
            }
        }
      
        // int [][]dp = new int[5][5];
        // for(int []d: dp) java.util.Arrays.fill(d, -1);
        // int moves = fn(row, col, mat, dp);
        // System.out.println(moves);
        
        int moves = Math.abs(2 - row) + Math.abs(2 - col);
        System.out.println(moves);
        sc.close();
    } 
    
//    static int fn(int i,int j,int [][] a, int [][]dp){
//         if(i<0 || j<0 || i>=5 || j>=5) return (int)1e9;
//         if(i == 2 && j == 2) return 0;
//         if(dp[i][j]!=-1) return dp[i][j];
//         dp[i][j] = (int)1e9;
//         int up = 1 + fn(i-1,j,a,dp);
//         int down = 1 + fn(i+1,j,a,dp);
//         int left = 1 + fn(i,j-1,a,dp);
//         int right = 1 + fn(i,j+1,a,dp);
//         return dp[i][j]=Math.min(Math.min(up,down),Math.min(left,right));
//     }
}

