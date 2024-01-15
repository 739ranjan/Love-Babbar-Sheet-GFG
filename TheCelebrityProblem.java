//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class TheCelebrityProblem{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(M[i][j] == 1)
                    adj.get(i).add(j);
            }
        }
        
        for(int i=0; i<n; i++){
            // System.out.println(adj.get(i));
            if(adj.get(i).size() == 0){
                int cel = i;
                for(int j=0; j<n; j++){
                    if(!adj.get(j).contains(i) && i!= j){
                        cel = -1;
                        break;
                    }
                }
                if(cel == i)
                    return cel;
            }
        }
        return -1;
    }
}
