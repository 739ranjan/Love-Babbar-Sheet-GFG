//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class SmallestSubarrayWithSumGreaterThenK {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    int X = Integer.parseInt(br.readLine());
		    
		    Complete obj = new Complete();
		    int ans = obj.search(arr, sizeOfArray, X, K);
		    System.out.println(ans);
		}
	}
}

// } Driver Code Ends


//User function Template for Java



class Complete{
    
   
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        if(n==1){
            if(arr[0] == x)
                return 0;
            else
                return -1;
        }
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                if(i == 0){
                    if(Math.abs(arr[i]-arr[i+1])<=k)
                        return i;
                }
                else if(i>0 && i<n-1){
                    if(Math.abs(arr[i]-arr[i-1])<=k && Math.abs(arr[i]-arr[i+1])<=k)
                        return i;
                }else if(i == n-1){
                    if(Math.abs(arr[i]-arr[i-1])<=k)
                        return i;
                }
            }
        }
        return -1;
            
    }
    
    
}





