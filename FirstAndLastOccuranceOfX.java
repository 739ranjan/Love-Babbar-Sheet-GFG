//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    int firstOcc(int[] arr, int n, int x, int start, int end){
        if(start <= end){
            int mid = start + (end - start) / 2;
            if((mid == 0 || arr[mid - 1] < x) && arr[mid] == x)
                return mid;
            else if(arr[mid] < x){
                return firstOcc(arr, n, x, mid+1, end);
            }
            else{
                return firstOcc(arr, n, x, start, mid-1);
            }
        }
        return -1;
    }
    int lastOcc(int[] arr, int n, int x, int start, int end){
        if(start <= end){
            int mid = start + (end - start) / 2;
            if((mid == n - 1 || arr[mid + 1] > x) && arr[mid] == x)
                return mid;
            else if(arr[mid] > x){
                return lastOcc(arr, n, x, start, mid - 1);
            }
            else{
                return lastOcc(arr, n, x, mid + 1, end);
            }
        }
        return -1;
    }
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(firstOcc(arr, n, x, 0, n-1));
        res.add(lastOcc(arr, n, x, 0, n-1));
        return res;
    }
}



//{ Driver Code Starts.

// Driver class
class FirstAndLastOccuranceOfX {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends
