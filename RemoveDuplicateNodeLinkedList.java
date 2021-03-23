import java.util.*;
public class RemoveDuplicateNodeLinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void removeFromSorted(Node head)
    {
        Node n=head;
        Stack<Integer> stack=new Stack<Integer>();
        while(n.next!=null)
        {
            if(stack.empty())
            {
                stack.push(n.data);
            }
            if(stack.search(n.next.data)==-1)
            {
                stack.push(n.next.data);
                n=n.next;
            }
            else
            {
                n.next=n.next.next;
            }
        }
        n=head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String[] args)
    {
        RemoveDuplicateNodeLinkedList list=new RemoveDuplicateNodeLinkedList();
        Node head1=list.head;
        head1=null;
        Node n=head1;
        int[] arr=new int[]{100,110,120,130,140,110,110,150};
        for(int i=0;i<arr.length;i++)
        {
            if(head1==null)
            {
                head1=new Node(arr[i]);
                n=head1;
            }
            else
            {
                n.next=new Node(arr[i]);
                n=n.next;
            }
        }
        n=head1;
        list.removeFromSorted(head1);
        System.out.println();
        Node head2=list.head;
        head2=null;
        Node n2=head2;
        int[] arr2=new int[]{140,130,150,110,140,100,140,120};
        for(int i=0;i<arr2.length;i++)
        {
            if(head2==null)
            {
                head2=new Node(arr2[i]);
                n2=head2;
            }
            else
            {
                n2.next=new Node(arr2[i]);
                n2=n2.next;
            }
        }
        n=head2;
        list.removeFromSorted(head2);
    }
}