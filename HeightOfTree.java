import java.util.*;

public class HeightOfTree{
    Node root;
    public static class Node{
        Node left,right;
        int key;
        Node(int key)
        {
            this.key=key;
            left=null;
            right=null;
        }
    }
    static int max=0;
    public static void FindHeightOfTree(Node root,int height)
    {
        if(root==null)
        {
            return;
        }
        if(height>max)
        {
            max=height;
        }
        FindHeightOfTree(root.left,height+1);
        FindHeightOfTree(root.right,height+1);
    }
    public static void FindLeftRightHeight(Node root)
    {
        int lheight=height(root.left);
        System.out.println("LeftHeight:"+lheight);
        int rheight=height(root.right);
        System.out.println("RightHeight:"+rheight);
    }
    public static int height(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        return (1+Math.max(height(node.left),height(node.right)));
    }
    public static void LevelOrder(Node root)
    {
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty())
        {
            Node node=queue.poll();
            if(node==null)
            {
                if(!queue.isEmpty())
                {
                    queue.add(null);
                    System.out.println();

                }
            }
            else
            {
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
                System.out.print(node.key+" ");
            }
            
        }

    }
    public static void main(String[] args)
    {
        HeightOfTree tree=new HeightOfTree();
        Node root=tree.root;
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.left=new Node(8);

        System.out.println("The given tree:");
        LevelOrder(root);
        FindHeightOfTree(root,0);
        System.out.println("\nMaxHeight:"+max);
        FindLeftRightHeight(root);
    }
}