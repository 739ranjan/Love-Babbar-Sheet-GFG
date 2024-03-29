//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			Solution s = new Solution();
			System.out.println(s.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class Solution
{
    private static boolean checkPalin(int num){ // function checks whether a numer is palindrom or not
        int temp = num;
        int newNum = 0;
        while(temp>0){
            newNum = (newNum * 10) + (temp % 10); 
            temp = temp/10;
        }
        if(newNum == num)
            return true;
        return false;
    }
	public static int palinArray(int[] a, int n)
           {
               for(int i=0; i<n; i++){
                   if(!checkPalin(a[i]))
                        return 0;
               }
               return 1;
           }
}
