class Node{
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

class binarytree{
    Node root;
    public binarytree()
    {
        this.root=null;
    }

    void add(int v)
    {
        if(this.root==null)
        {
            this.root=new Node(v);
            return;
        }
        else{
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


}
public class Tree {

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

        binarytree t=new binarytree();
        t.add(10);
        t.add(4);
        t.add(3);
        t.add(5);
        t.add(15);
        t.add(14);
        t.add(16);

        preorder(t.root);
        System.out.println();
        inorder(t.root);
        System.out.println();
        postorder(t.root);
        

    }
    
}
