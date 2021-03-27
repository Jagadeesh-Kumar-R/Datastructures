import java.util.*;
public class BinaryTree{
    Node root;
    Node temp=root;
    static class Node
    {
        int key;
        Node left,right;
        Node(int key)
        {
            this.key=key;
            left=null;
            right=null;
        }
    }
    static void levelorder(Node node)
    {
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(node);
        queue.add(null);
        while(!queue.isEmpty())
        {
            Node curr=queue.poll();
            if(curr==null)
            {
                if(!queue.isEmpty())
                {
                    queue.add(null);
                    System.out.println();
                }
            }
            else
            {
                if(curr.left!=null)
                {
                    queue.add(curr.left);
                }
                if(curr.right!=null)
                {
                    queue.add(curr.right);
                }
                System.out.print(curr.key+" ");
            }
        }
    }
    static void PreOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.print(node.key+" ");
        InOrder(node.left);
        InOrder(node.right);
    }
    static void PostOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.key+" ");
    }
    static void InOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        InOrder(node.left);
        System.out.print(node.key+" ");
        InOrder(node.right);
    }
    static void inorder(Node node)
    {
        Stack<Node> stack=new Stack<Node>();
        if(node==null)
        {
            return;
        }
        while(node!=null||stack.size()>0)
        {
            while(node!=null)
            {
                //System.out.println(node.key);     //Preorder
                stack.push(node);
                node=node.left;
            }
            node=stack.pop();
            System.out.println(node.key);       //Inorder
            node=node.right;
        }
    }
    public static void main(String[] args)
    {
        BinaryTree tree=new BinaryTree();
        Node root=tree.root;
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.left=new Node(8);
        root.left.left.right=new Node(9);
        root.left.right.left=new Node(10);
        root.left.right.right=new Node(11);

        System.out.println("InOrder Traversal");
        inorder(root);
        System.out.println("Level Order Traversal");
        levelorder(root);

        System.out.println("\nInOrder Traversal");
        InOrder(root);
        System.out.println("\nPreOrder Traversal");
        PreOrder(root);
        System.out.println("\nPostOrder Traversal");
        PostOrder(root);
    }
}