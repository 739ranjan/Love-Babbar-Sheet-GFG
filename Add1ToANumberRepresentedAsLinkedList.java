//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class Add1ToANumberRepresentedAsLinkedList
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    static Node reverse(Node head){
        if(head == null || head.next == null)
            return head;
        Node prev = null, next = null, curr = head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static Node addOne(Node head) 
    { 
        //With space complexity O(N) and time complexity O(N)
        
        head = reverse(head);
        
        int carry = 0;
        Node curr = head;
        if(head != null){
            int sum = head.data + 1;
            head.data = sum % 10;
            carry = sum /10;
            curr = curr.next;
        }
        while(curr != null && carry == 1){
            int sum = curr.data + carry;
            curr.data = sum % 10;
            carry = sum /10;
            curr = curr.next; 
        }
        
        head = reverse(head);
        if(carry == 1){
            curr = new Node(carry);
            curr.next = head;
            head = curr;
        }
        return head;
        
        /* With space complexity O(N) and time complexity O(N)
        Stack<Node> stk = new Stack<>();
        Node curr = head;
        while(curr != null){
            stk.push(curr);
            curr = curr.next;
        }
        int carry = 0;
        if(!stk.isEmpty()){
            int sum = stk.peek().data + 1;
            carry = sum / 10;
            stk.peek().data = sum % 10;
            stk.pop();
        }
        while(!stk.isEmpty() && carry == 1){
            int sum = stk.peek().data + 1;
            carry = sum / 10;
            stk.peek().data = sum % 10;
            stk.pop();
        }
        if(carry == 1){
            Node res = new Node(carry);
            res.next = head;
            head = res;
        }
        return head;
        */
    }
}
