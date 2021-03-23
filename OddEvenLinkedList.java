public class OddEvenLinkedList {
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
    public static void main(String[] args)
    {
        OddEvenLinkedList list=new OddEvenLinkedList();
        Node head=list.head;
        head=null;
        Node n=head;
        int[] a=new int[]{1,2,4,5,3,9,6,0,7};
        Node prevnode=new Node(0);
        for(int i=0;i<a.length;i++)
        {
            if(head==null)
            {
                head=new Node(a[i]);
                n=head;
            }
            else
            {
                n.next=new Node(a[i]);
                n=n.next;
            }
        }
        n=head;
        Node curr=n;
        Node oddnode=null,evennode=null,oddhead=oddnode,evenhead=evennode;
        while(curr!=null)
        {
            prevnode.next=curr.next;
            curr.next=null;
            if(curr.data%2==0)
            {
                if(evenhead==null)
                {
                    evenhead=curr;
                    evennode=evenhead;
                }
                else{
                    evennode.next=curr;
                    evennode=evennode.next;
                }
            }
            else{
                if(oddhead==null)
                {
                    oddhead=curr;
                    oddnode=oddhead;
                }
                else{
                    oddnode.next=curr;
                    oddnode=oddnode.next;
                }
            }
            curr=prevnode.next;
        }
        System.out.println("\nOdd Nodes Are:");
        oddnode=oddhead;
        while(oddnode!=null)
        {
            System.out.print(oddnode.data+" ");
            oddnode=oddnode.next;
        }
        System.out.println("\nEven Nodes Are:");
        evennode=evenhead;
        while(evennode!=null)
        {
            System.out.print(evennode.data+" ");
            evennode=evennode.next;
        }

    }
}
