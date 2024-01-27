//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class MergeSortForLinkedList
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}



// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        if(head == null || head.next == null)
            return head;
            
        Node fast = head;
        Node slow = head;
        Node mid = null;
        
        while(fast != null && fast.next != null){
            mid = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        mid.next = null;
        
        Node head1 = mergeSort(head);
        Node head2  = mergeSort(slow);
        
        return merge(head1, head2);
    }
    static Node merge(Node head1, Node head2){
        if(head1 == null)
            return head2;
        if(head2 == null)
            return head1;
        
        Node res = new Node(-1);
        Node curr = res;
        
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                curr.next = head1;
                curr = head1;
                head1 = head1.next;
            }else{
                curr.next = head2;
                curr = head2;
                head2 = head2.next;
            }
        }
        if(head2 != null)
            curr.next = head2;
        if(head1 != null)
            curr.next = head1;
        return res.next;
    }
}


