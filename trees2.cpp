#include <iostream>

using namespace std;

class node
{
    public:
    int val;
    node *left;
    node *right;

    node(int v)
    {
        this->val=v;
        this->left=NULL;
        this->right=NULL;
    }
};

class binarytree
{
    public:
    node *root;

    binarytree()
    {
        this->root=NULL;
    }

    void add(int v)
    {
        node *newnode=new node(v);
        if(this->root==NULL)
        {
            this->root=newnode;
        }
        else{
            node *temp=this->root;
            while(true)
            {
                if(v<temp->val)
                {
                    if(temp->left!=NULL)
                    {
                        temp=temp->left;
                    }
                    else{
                        temp->left=newnode;
                        break;
                    }
                }
                else{
                    if(temp->right!=NULL)
                    {
                        temp=temp->right;
                    }
                    else{
                        temp->right=newnode;
                        break;
                    }
                }
            }

        }
    }
};

void inorder(node *root)
{
    if(root!=NULL)
    {
        inorder(root->left);
        cout<<root->val<<" ";
        inorder(root->right);
    }
}

void preorder(node *root)
{
    if(root!=NULL)
    {
        cout<<root->val<<" ";
        preorder(root->left);
        preorder(root->right);
    }
}

void postorder(node *root)
{
    if(root!=NULL)
    {
        postorder(root->left);
        postorder(root->right);
        cout<<root->val<<" ";
    }
}
int main()
{
    binarytree bt;
    bt.add(5);
    bt.add(3);
    bt.add(4);
    bt.add(8);
    bt.add(7);
    bt.add(9);
    inorder(bt.root);
    cout<<endl;
    preorder(bt.root);
    cout<<endl;
    postorder(bt.root);
    cout<<endl;
}