class Node 
{ 
    int data; 
    Node next; 
    Node(int d) 
    { 
        data = d; 
        next = null; 
    } 
} 
  
public class SwapLinkedList 
{ 
    Node head; 
    public void swapNodes(int x, int y) 
    { 
        if (x == y) return; 
        Node prevX = null, currX = head; 
        while (currX != null && currX.data != x) 
        { 
            prevX = currX; 
            currX = currX.next; 
        } 
        Node prevY = null, currY = head; 
        while (currY != null && currY.data != y) 
        { 
            prevY = currY; 
            currY = currY.next; 
        } 
        if (currX == null || currY == null) 
            return; 
        if (prevX != null) 
            prevX.next = currY; 
        else //make y the new head 
            head = currY; 
  
        // If y is not head of linked list 
        if (prevY != null) 
            prevY.next = currX; 
        else // make x the new head 
            head = currX; 
  
        // Swap next pointers 
        Node temp = currX.next; 
        currX.next = currY.next; 
        currY.next = temp; 
    } 
    
    void pairWiseSwap() 
    { 
        Node temp = head; 
  
        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) { 
  
            /* Swap the data */
            int k = temp.data; 
            temp.data = temp.next.data; 
            temp.next.data = k; 
            temp = temp.next.next; 
        } 
    } 
  
    public void push(int new_data) 
    { 
        Node new_Node = new Node(new_data); 
  
        new_Node.next = head; 
  
        head = new_Node; 
    } 
  
    public void printList(Node head) 
    { 
        Node tNode = head; 
        while (tNode != null) 
        { 
            System.out.print(tNode.data+" "); 
            tNode = tNode.next; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        SwapLinkedList llist = new SwapLinkedList(); 
  
        llist.push(7); 
        llist.push(6); 
        llist.push(5); 
        llist.push(4); 
        llist.push(3); 
        llist.push(2); 
        llist.push(1); 
  
        System.out.print("\n Linked list before calling swapNodes() "); 
        llist.printList(llist.head); 
  
        llist.swapNodes(4, 3); 
  
        System.out.print("\n Linked list after calling swapNodes() "); 
        llist.printList(llist.head); 
        
        System.out.print("\n After Pairwise Swapping: ");
        
        llist.pairWiseSwap();
        llist.printList(llist.head);
    } 
} 