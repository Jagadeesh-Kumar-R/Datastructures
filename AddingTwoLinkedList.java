public class AddingTwoLinkedList{
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
    public static void main(String []args)
    {
        int[] arr1=new int[]{10,20,30,40,50};
        int[] arr2=new int[]{100,200,300,400,500};
        AddingTwoLinkedList list1=new AddingTwoLinkedList();      //Creating First LinkedList
        Node head1=list1.head;
        head1=new Node(10);
        Node first_1=new Node(20);
        head1.next=first_1;
        Node first_2=new Node(30);
        first_1.next=first_2;
        for(int i=0;i<5;i++)
        {
            first_2.next=new Node(arr1[i]);
            first_2=first_2.next;
        }
        first_1=head1;
        while(first_1!=null)
        {
            System.out.print(first_1.data+" ");
            first_1=first_1.next;
        }
        System.out.println();
        first_1=head1;
        
        AddingTwoLinkedList list2=new AddingTwoLinkedList();      //Creating Second LinkedList
        Node head2=list2.head;
        head2=new Node(100);
        Node second_1=new Node(200);
        head2.next=second_1;
        Node second_2=new Node(300);
        second_1.next=second_2;
        for(int i=0;i<5;i++)
        {
            second_2.next=new Node(arr2[i]);
            second_2=second_2.next;
        }
        second_1=head2;
        while(second_1!=null)
        {
            System.out.print(second_1.data+" ");
            second_1=second_1.next;
        }
        System.out.println();
        second_1=head2;
        
        AddingTwoLinkedList Ans=new AddingTwoLinkedList();        //Adding two linkedlist on new LinkedList
        Node head=Ans.head;
        head=new Node(first_1.data+second_1.data);
        first_1=first_1.next;
        second_1=second_1.next;
        Node res=new Node(first_1.data+second_1.data);
        head.next=res;
        while(first_1.next!=null)
        {
            
            first_1=first_1.next;
            second_1=second_1.next;
            res.next=new Node(first_1.data+second_1.data);
            res=res.next;
        }
        res=head;
        while(res!=null)
        {
            System.out.print(res.data+" ");
            res=res.next;
        }
        
    }
}