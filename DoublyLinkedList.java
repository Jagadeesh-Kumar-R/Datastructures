public class DoublyLinkedList{
    Node head;
    static class Node{
        Node next,prev;
        int data;
        Node(int d)
        {
            data=d;
            next=null;
            prev=null;
        }
    }
    public void show_FWD_BWD_List(Node node){
        Node n=node,last=null;
        System.out.println("\nForward Linked List");
        while(n!=null)
        {
            System.out.print(n.data+" ");
            last=n;
            n=n.next;
        }
        System.out.println("\nBackward Linked List");
        while(last!=null)
        {
            System.out.print(last.data+" ");
            last=last.prev;
        }
    }
    public static void main(String[] args)
    {
        DoublyLinkedList list=new DoublyLinkedList();
        Node head=list.head;
        Node n=head;
        int[] a=new int[]{1,2,3,4,5};
        for(int i=0;i<a.length;i++)     //Creating and Inserting data in doubly LinkedList
        {
            if(head==null)
            {
                head=new Node(a[i]);
                n=head;
            }
            else{
                n.next=new Node(a[i]);
                n.next.prev=n;
                n=n.next;
            }
        }
        n=head;
        while(n.data!=3)        //Inserting a Node at given place
        {
            n=n.next;
        }
        Node temp=n.next;
        n.next=new Node(100);
        n.next.next=temp;
        n.next.prev=n;
        n.next.next.prev=n.next;

        n=head;
        list.show_FWD_BWD_List(n);

        while(n.next.data!=4)       //Deleting a given Node
        {
            n=n.next;
        }
        n.next=n.next.next;
        n.next.prev=n;
        n=head;
        list.show_FWD_BWD_List(n);

        Node revtemp=null;      //Reversing Doubly Linked List
        while(n!=null)
        {
            revtemp=n.prev;
            n.prev=n.next;
            n.next=revtemp;
            n=n.prev;
        }
        if(revtemp!=null)
        {
            head=revtemp.prev;
        }
        n=head;
        list.show_FWD_BWD_List(n);
    }
}