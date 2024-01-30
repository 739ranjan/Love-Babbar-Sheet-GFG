//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class PermutaionsOfAGivenString
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public void helper(String un, String p, List<String> res){
        if(un.isEmpty()){
            if(!res.contains(p))
                res.add(p);
            return;
        }
        char ch = un.charAt(0);
		
		for(int i=0; i<=p.length(); i++) {
			String f = p.substring(0, i);
			String b = p.substring(i);
            helper(un.substring(1), f+ch+b, res);
		}
    }
    public List<String> find_permutation(String s) {
        List<String> res = new ArrayList<>();
        
        if(s.length() == 0 || s.length() == 1){
            return res;
        }
        
        helper(s, "", res);
        Collections.sort(res);
        return res;
    }
}
