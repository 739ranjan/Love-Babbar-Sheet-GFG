//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class SortBySetBitCount {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Integer arr[] = new Integer[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            obj.sortBySetBitCount(arr, n);
            StringBuilder output = new StringBuilder();
            for(int i = 0; i < n; i++)
            output.append(arr[i] + " ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        Arrays.sort(arr, new MyComprator());
    } 
}

class MyComprator implements Comparator<Integer>{
    @Override
    public int compare(Integer i1, Integer i2){
        int count1 = 0;
        while(i1>0){
            count1 += i1 & 1;
            i1 = i1>>1;
        }
        
        int count2 = 0;
        while(i2>0){
            count2 += i2 & 1;
            i2 = i2>>1;
        }
        
        return count2 - count1;
    }
}
