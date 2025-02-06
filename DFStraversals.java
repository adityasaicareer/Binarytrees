class Node
{
    int val;
    Node left;
    Node right;
    public Node(int v)
    {   
        this.val=v;
        this.left=null;
        this.right=null;
    }
}

class Binarytree{
    Node root;
    public Binarytree(){
        this.root=null;
    }

    void add(int v)
    {
        if(this.root==null)
        {
            this.root=new Node(v);
            return;
        }
        Node temp=this.root;
        while(true)
        {
            if(v<temp.val)
            {
                if(temp.left!=null)
                {
                    temp=temp.left;
                }
                else{
                    temp.left=new Node(v);
                    return;
                }
            }
            else{
                if(temp.right!=null)
                {
                    temp=temp.right;
                }
                else{
                    temp.right=new Node(v);
                    return;
                }
            }
        }

    }

}
public class DFStraversals
{

    public static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.val+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.val+" ");
            inorder(root.right);
        }
    }

    public static void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val+" ");
        }
    }
    public static void main(String args[])
    {
        Binarytree b=new Binarytree();
        b.add(5);
        b.add(3);
        b.add(8);
        b.add(2);
        b.add(4);
        b.add(7);
        b.add(6);

        preorder(b.root);
        System.out.println();
        inorder(b.root);
        System.out.println();
        postorder(b.root);
        System.out.println();

    }
}