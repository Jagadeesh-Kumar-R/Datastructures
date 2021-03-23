public class LinkedList{
    
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
    

     public static void main(String []args){
        LinkedList list=new LinkedList();
        Node head=list.head;
        head=new Node(1);
        Node n1=new Node(2);
        Node n2=new Node(3);
        head.next=n1;
        n1.next=n2;
        
        Node new_node_first=new Node(0);    //add node to starting of linked list
        new_node_first.next=head;
        head=new_node_first;
        
        //--------------------------------------------------------------------------
        
        Node new_node_end=new Node(5);      //add node to end of linked list
        while(n1.next!=null)
        {
            n1=n1.next;
        }
        n1.next=new_node_end;
        
        //------------------------------------------------------------------------
        
        n1=head;
        Node new_node_middle=new Node(100);     //add node to middle of the linkedlist
        int total=0;
        while(n1!=null)
        {
            n1=n1.next;
            total++;
        }
        int mid=total/2;
        n1=head;
        int i=0;
        while(i<mid-1)
        {
            n1=n1.next;
            i++;
        }
        new_node_middle.next=n1.next;
        n1.next=new_node_middle;
        
        //------------------------------------------------------------------------
        
        while(n1.data!=3)       //add node after a given node in linkedlist
        {
            n1=n1.next;
        }
        Node new_node_after_3=new Node(200);
        new_node_after_3.next=n1.next;
        n1.next=new_node_after_3;
        
        //--------------------------------------------------------------------------
        
        n1=head;        //deleting a given node from linked list
        while(n1.next.data!=2)
        {
            n1=n1.next;
        }
        n1.next=n1.next.next;
        
        n1=head;
        while(n1!=null)     //displaying the content of linked list
        {
            System.out.println(n1.data);
            n1=n1.next;
        }
     }
}