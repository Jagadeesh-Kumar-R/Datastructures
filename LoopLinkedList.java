import java.util.*;

public class LoopLinkedList{
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
    public void calcNodeLenAndDelete(Node node)
    {
        int len=1;
        Node temp=node;
        while(temp.next!=node)
        {
            len++;
            temp=temp.next;
        }
        temp.next=null;
        System.out.println(len);
    }
    public static void main(String[] args)
    {
        HashSet<Node> set=new HashSet<Node>();
        LoopLinkedList list=new LoopLinkedList();
        Node head=list.head;
        head=new Node(1);
        Node second=new Node(2);
        head.next=second;
        Node third=new Node(3);
        second.next=third;
        Node fourth=new Node(4);
        third.next=fourth;
        Node fifth=new Node(5);
        fourth.next=fifth;
        fifth.next=second;
        Node n=head;
        boolean bool=false;
        while(n!=null)
        {
            if(set.contains(n))
            {
                bool=true;
                list.calcNodeLenAndDelete(n);
                break;
            }
            else
            {
                set.add(n);
            }
            n=n.next;
        }
        n=head;
        System.out.println(bool);
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
}