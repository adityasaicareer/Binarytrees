class Node
{
    constructor(v)
    {
        this.val=v;
        this.left=null;
        this.right=null;
    }
}

class Tree
{
    constructor()
    {
        this.root=null;
    }

    add(v)
    {
        if(this.root==null)
        {
            this.root=new Node(v);
            return;
        }
        let temp=this.root;
        while(true)
        {
            if(v<temp.val)
            {
                if(temp.left==null)
                {
                    temp.left=new Node(v);
                    return;
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

function inorder(root)
{
    if(root!=null)
    {
        inorder(root.left);
        console.log(root.val);
        inorder(root.right);
    }
}

let t=new Tree();
t.add(5);
t.add(3);
t.add(8);

inorder(t.root);