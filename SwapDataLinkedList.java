public class SwapDataLinkedList{
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
    public void getLastToFirst(Node head)
    {
        int last=0;
        Node n=head,secLast=null;
        while(n.next!=null)
        {
            secLast=n;
            n=n.next;
        }
        last=n.data;
        secLast.next=null;
        Node new_node=new Node(last);
        new_node.next=head;
        n=new_node;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String[] args)
    {
        SwapDataLinkedList list=new SwapDataLinkedList();
        Node head=list.head;
        head=null;
        Node n=head;
        for(int i=0;i<10;i++)
        {
            if(head==null)
            {
                head=new Node(i);
                n=head;
            }
            else
            {
                n.next=new Node(i);
                n=n.next;
            }
        }
        n=head;
        while(n!=null)
        {
            if(n.data==3)
            {
                n.data=7;
            }
            else if(n.data==7)
            {
                n.data=3;
            }
            n=n.next;
        }
        n=head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
        n=head;
        list.getLastToFirst(n);
    }
}