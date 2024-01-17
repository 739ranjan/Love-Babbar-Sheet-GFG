//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class SecondMostRepeatedStringInASequence
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i], 1);
            else
                map.put(arr[i], map.get(arr[i])+1);
        }
        int max = 0, sMax = -1;
        String res = "",maxStr = "";
        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(max < e.getValue()){
                sMax = max;
                res = maxStr;
                max = e.getValue();
                maxStr = e.getKey();
            }else if(sMax < e.getValue()){
                sMax = e.getValue();
                res = e.getKey();
            }
        }
        return res;
    }
}
