//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class MajorityElement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        int element = a[0];
        int counter = 1;
        for(int i=1; i<size; i++){
            if(counter == 0){
                counter++;
                element = a[i];
            }
            else if(a[i] == element){
                counter++;
            }
            else{
                counter--;
            }
        }
        int count = 0;
        for(int i=0; i<size; i++){
            if(a[i] == element)
                count++;
        }
        if(count>size/2)
            return element;
        return -1;
        
    }
}
