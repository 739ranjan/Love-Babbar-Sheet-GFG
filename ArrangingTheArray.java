//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class ArrangingTheArray {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.Rearrange(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void Rearrange(int a[], int n)
    {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(a[i]<0){
                neg.add(a[i]);
            }
            else{
                pos.add(a[i]);
            }
        }
        int i=0,j=0;
        while(j<neg.size()){
            a[i] = neg.get(j);
            i++;
            j++;
        }
        j=0;
        while(j<pos.size()){
            a[i] = pos.get(j);
            i++;
            j++;
        }
    }
}
