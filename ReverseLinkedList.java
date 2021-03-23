public class ReverseLinkedList{
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
        ReverseLinkedList list=new ReverseLinkedList();
        Node head=list.head;
        head=null;
        Node n=head;
        int[] a=new int[]{1,2,3,4,5,6,7,8,9,0};
        for(int i=0;i<a.length;i++)
        {
            if(head==null)
            {
                head=new Node(a[i]);
                n=head;
            }
            else{
                n.next=new Node(a[i]);
                n=n.next;
            }
        }
        Node temp=null,ans=null;
        n=head;
        while(n!=null)
        {
            temp=n.next;
            n.next=ans;
            ans=n;
            n=temp;
        }
        while(ans!=null)
        {
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
}