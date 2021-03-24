public class InsertNodeSortedCircularLinkedList{
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
        InsertNodeSortedCircularLinkedList list=new InsertNodeSortedCircularLinkedList();
        Node head=list.head;
        head=null;
        Node n=head;
        int a[]=new int[]{1,2,3,5,6,8};
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
        Node temp=new Node(4);
        while(n.next.data<temp.data)
        {
            n=n.next;
        }
        temp.next=n.next;
        n.next=temp;
        n=head;
        list.showList(n);
    }
}