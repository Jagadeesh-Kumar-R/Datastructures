public class CycleLinkedList{
    Node head,head1,head2;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next=null;
        }
    }
    public void showList(Node node)
    {
        Node n=node;
        do{
            System.out.print(n.data+" ");
            n=n.next;
        }while(n!=node);
        System.out.println();
    }
    public static void main(String[] args)
    {
        CycleLinkedList list=new CycleLinkedList();
        Node head=list.head;
        head=null;
        Node n=head;
        int a[]=new int[]{1,2,3,4,5};
        for(int i=0;i<a.length;i++)
        {
            if(head==null)
            {
                head=new Node(a[i]);
                head.next=head;
                n=head;
            }
            else{
                Node temp=new Node(a[i]);
                temp.next=n.next;
                n.next=temp;
                n=n.next;
            }
        }
        n=head;

        while(n.next!=head)     //add node to beginning of list
        {
            n=n.next;
        }

        Node newtempbegin=new Node(0);
        newtempbegin.next=n.next;
        n.next=newtempbegin;
        n=n.next;
        head=n;

        while(n.next!=head)     //add node at end of list
        {
            n=n.next;
        }
        
        Node newtempend=new Node(6);
        newtempend.next=n.next;
        n.next=newtempend;
        n=n.next;
        
        n=head;
        Node newtempafter3=new Node(100);        //add node after 3
        while(n.data!=3)
        {
            n=n.next;
        }
        newtempafter3.next=n.next;
        n.next=newtempafter3;
        n=n.next;

        n=head;
        list.showList(n);

        int len=0,mid=0;
        do
        {
            len++;
            n=n.next;
        }while(n!=head);
        mid=len/2;
        System.out.println("Mid: "+mid);

        n=head;
        Node node1=null;
        Node head2=list.head2,head1=list.head1;
        head1=null;
        head2=null;
        for(int i=0;i<mid;i++)
        {
            if(head1==null)
            {
                head1=new Node(n.data);
                node1=head1;
            }
            else
            {
                node1.next=new Node(n.data);
                node1=node1.next;
            }
            n=n.next;
        }
        node1.next=head1;
        node1=head1;

        head2=n;
        while(n.next!=head)
        {
            n=n.next;
        }
        n.next=head2;
        n=head2;

        System.out.print("First Half of the list: ");
        list.showList(node1);
        System.out.print("Second Half of the list: ");
        list.showList(n);
    }
}