//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class Transfiguration
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transfigure (A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transfigure (String A, String B)
    {
    	if(A.length() != B.length())
    	    return -1;
    	char[] ch = A.toCharArray();
    	Arrays.sort(ch);
    	char[] ch2 = B.toCharArray();
    	Arrays.sort(ch2);
    	String a = new String(ch);
    	String b = new String(ch2);
    	if(!a.equals(b))
    	    return -1;
    	int i = A.length()-1;
    	int j = B.length()-1;
    	int res = 0;
    	while(i>=0 && j>=0){
    	    if(A.charAt(i) != B.charAt(j)){
    	        res++;
    	        i--;
    	    }else{
    	        i--;
    	        j--;
    	    }
    	}
    	return res;
    }
}
