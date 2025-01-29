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

class bintree
{
    public:
    node *root;

    bintree()
    {
        this->root=NULL;
    }

    void add(int v)
    {
        node *newnode=new node(v);
        if(this->root==NULL)
        {
            this->root=newnode;
            return;
        }
        node *temp=root;
        while(true)
        {
            if(v<(temp->val))
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
int main()
{
    bintree b;
    b.add(5);
    b.add(3);
    b.add(7);
    b.add(2);
    b.add(4);
    b.add(6);
    b.add(8);

    inorder(b.root);


}