public class SplitCycleLinkedList{
    Node head,head1,head2;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
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
        SplitCycleLinkedList list=new SplitCycleLinkedList();
        Node head=list.head;
        head=null;
        Node n=head;
        int a[]=new int[]{1,2,3,4,5,6,7,8};
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
        list.showList(n);

        Node fast=head,slow=head;
        while(fast.next!=head&&fast.next.next!=head)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast.next.next==head)
        {
            fast=fast.next;
        }
        Node head1=list.head1,head2=list.head2;
        head1=head;
        head2=slow.next;
        fast.next=slow.next;
        slow.next=head;
        list.showList(head1);
        list.showList(head2);
    }
}