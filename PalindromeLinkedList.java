import java.util.*;
public class PalindromeLinkedList {
    Node head;
    static class Node{
        char ch;
        Node next;
        Node(char c)
        {
            ch=c;
            next=null;
        }
    }
    public void reverse(Node head){
        String S="";
        Node n=head;
        Stack<Character> stack=new Stack<Character>();
        while(n!=null)
        {
            stack.push(n.ch);
            n=n.next;
        }
        n=head;
        while(n!=null)
        {
            S=S+stack.pop();
            n=n.next;
        }
        System.out.println("Reversed String:"+S);
    }
    public static void main(String args[]) {
      PalindromeLinkedList list=new PalindromeLinkedList();
      Node head=list.head;
      head=null;
      Node str=head;
      String s="LaLgAL";
      s=s.toLowerCase();
      Stack<Character> stack=new Stack<Character>();
      for(int i=0;i<s.length();i++)
      {
          stack.push(s.charAt(i));
          if(head==null)
          {
              head=new Node(s.charAt(i));
              str=head;
          }
          else
          {
              str.next=new Node(s.charAt(i));
              str=str.next;
          }
      }
      str=head;
      while(str!=null)
      {
          if(stack.pop()==str.ch)
          {
              str=str.next;
          }
          else
          {
              System.out.println(s+" Is Not a palindrome");
              break;
          }
      }
      if(str==null)
      {
          System.out.println(s+" Is a Palindrome");
      }
      list.reverse(head);
    }
}