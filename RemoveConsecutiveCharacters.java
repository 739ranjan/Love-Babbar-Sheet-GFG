//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class RemoveConsecutiveCharacters {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
        if(S.isEmpty())
            return S;
        StringBuilder sb = new StringBuilder("" + S.charAt(0));
        for(int i=1; i<S.length(); i++){
            if(S.charAt(i) != sb.charAt(sb.length()-1))
                sb.append(S.charAt(i));
        }
        return new String(sb);
    }
}
