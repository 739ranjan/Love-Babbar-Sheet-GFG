//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maximizeSum(a, n, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {

    public static long maximizeSum(long a[], int n, int k)
    {
        Arrays.sort(a);
        int pos=0, neg=0, zer=0;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(a[i]<0){
                neg++;
            }
            else if(a[i]>0){
                pos++;
            }
            else{
                zer++;
            }
            sum += a[i];
        }
        int i=0, tempNeg = neg, tempZer = zer, tempPos = pos;
        while(tempNeg>0 && k>0){
            a[i] = -a[i];
            sum += 2*a[i];
            tempNeg--;
            k--;
            i++;
        }
        
        if(k>0 && zer>0){
            return sum;
        }
        
        Arrays.sort(a);
        if(k%2 == 0){
            return sum;
        }
        
        return sum - a[0]*2;
    }
}
