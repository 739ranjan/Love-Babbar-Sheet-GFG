//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class SearchInAMatrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int mat[][] = new int[n][m];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                  mat[i][j] = sc.nextInt();
            }
            
            int x = sc.nextInt();
            
            System.out.println (new Sol().matSearch(mat, n, m, x));
        }
        
    }
}
// } Driver Code Ends


class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        
        for(int i=0; i<N; i++){
            if(mat[i][0] == X || mat[i][M-1] == X)
                return 1;
            
            if(mat[i][0] < X && mat[i][M-1] > X){
                int l = 0, r = M-1;
                while(l<=r){
                    int mid = l + (r - l) / 2;
                    if(mat[i][mid] == X)
                        return 1;
                    else if(mat[i][mid] > X)
                        r = mid - 1;
                    else
                        l = mid + 1;
                }
            }
        }
        return 0;
    }
}
