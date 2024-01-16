//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class SmallestFactorialNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            
            System.out.println(new Solution().findNum(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findNum(int n)
    {
        int res = 0;
        int num = 5;
        while(res < n){
            int count = 0,tempNum = num;
            while(tempNum%5 == 0){
                res++;
                tempNum /= 5;
            }
            if(res < n)
                num += 5;
        }
        return num;
    }
}
