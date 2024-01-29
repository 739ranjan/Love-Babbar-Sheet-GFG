//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
class IntersectionOfTwoSortedLinkedList
{
    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
        {
            
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n , m;
                    
                    n = sc.nextInt();
                    m = sc.nextInt();
                    
                    Node head1 = inputList(n);
                    Node head2 = inputList(m);
                    
                    Solution obj = new Solution();
                    
                    Node result = obj.findIntersection(head1, head2);
	    
	                printList(result);
	                System.out.println();
                }
        }
}
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        if(head1 == null || head2 == null)
            return null;
        
        Node res = new Node(-1);
        Node curr = res;
        Node list1 = head1, list2 = head2;
        
        while(list1 != null && list2 != null){
            if(list1.data == list2.data){
                curr.next = list1;
                list1 = list1.next;
                list2 = list2.next;
                curr = curr.next;
                curr.next = null;
            }else if(list1.data > list2.data){
                list2 = list2.next;
            }else{
                list1 = list1.next;
            }
        }
        return res.next;
    }
}
