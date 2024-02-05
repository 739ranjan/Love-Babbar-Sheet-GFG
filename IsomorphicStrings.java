//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class IsomorphicStrings {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length() != str2.length())
            return false;
        Map<Character, Character> map = new HashMap<>();
        
        for(int i=0; i<str1.length(); i++){
            char s1 = str1.charAt(i);
            char s2 = str2.charAt(i);
            
            if(!map.containsKey(s1)){
                if(!map.containsValue(s2)){
                    map.put(s1,s2);
                }
                else{
                    return false;
                }
            }
            else{
                if(map.get(s1) != s2)
                    return false;
            }
        }
        return true;
    }
}
