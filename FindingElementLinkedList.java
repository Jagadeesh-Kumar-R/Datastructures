public class FindingElementLinkedList{
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
    public void numberOfOccurance(Node head,int num)
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            if(temp.data==num)
            {
                count++;
            }
            temp=temp.next;
        }
        System.out.println("Number Of Occurance Of "+num+" is "+count);
    }
    public void findNodeAtPositionFromEnd(Node head,int position)
    {
        int total=count(head);
        position=total-position;
        findNodeAtPosition(head,position);
    }
    public int findNodeAtPosition(Node head,int position)
    {
        Node temp=head;
        for(int i=1;temp!=null;i++)
        {
            if(i==position)
            {
                System.out.println("Node At Position Given is "+temp.data);
                return temp.data;
            }
            temp=temp.next;
        }
        return 0;
    }
    public void search(Node head)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==400)
            {
                System.out.println("Element Found At:"+(i+1));
                break;
            }
            i++;
            temp=temp.next;
            if(temp==null)
            {
                System.out.println("Element Not Found");
            }
        }
    }
    public int count(Node head)
    {
        Node temp=head;
        int total=0;
        while(temp!=null)
        {
            total++;
            temp=temp.next;
        }
        System.out.println("Total:"+total);
        return total;
    }
    public static void main(String[] args)
    {
        FindingElementLinkedList list=new FindingElementLinkedList();
        Node head=null;
        head=list.head;
        Node n1=head;
        int[] a=new int[]{100,200,300,400,500,600,500,500};
        for(int i=0;i<8;i++)
        {
            if(n1==null)
            {
                head=new Node(a[i]);
                n1=head;
            }
            else
            {
                n1.next=new Node(a[i]);
                n1=n1.next;
            }
            System.out.print(n1.data+" ");
        }
        n1=head;
        System.out.println();
        list.count(head);
        list.search(head);
        list.findNodeAtPosition(head,3);
        list.findNodeAtPositionFromEnd(head,4);
        list.numberOfOccurance(head,500);
    }
}