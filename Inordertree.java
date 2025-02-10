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

class tree{
    Node root;
    public tree()
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
                    if(temp.left==null)
                    {
                        temp.left=new Node(v);
                    }
                    else{
                        temp=temp.left;
                    }
                }
                else{
                    if(temp.right==null)
                    {
                        temp.right=new Node(v);
                        return;
                    }
                    else{
                        temp=temp.right;
                    }
                }
            }
        }
    }
}
public class Inordertree
{ 

   
    public static void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.val+" ");
           
            inorder(root.right);
        }
    }
    public static void main(String args[])
    {
        tree t=new tree();
        t.add(4);
        t.add(2);
        t.add(8);
        t.add(7);
        t.add(9);
        t.add(3);
        


    }
}