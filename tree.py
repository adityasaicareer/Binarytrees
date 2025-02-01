class node:
    def __init__(self,n):
        self.val=n
        self.left=None
        self.right=None

class Trees:
    def __init__(self):
        self.root=None
    
    def add(self,n):

        if(self.root==None):
            self.root=node(n)
        
        else:
            temp=self.root
            while True:
                if(n<temp.val):
                    if temp.left==None:
                        temp.left=node(n)
                        break;
                    else:
                        temp=temp.left
                else:
                    if(temp.right==None):
                        temp.right=node(n)
                        break
                    else:
                        temp=temp.right


def inorder(root):
    if(root!=None):
        inorder(root.left)
        print(root.val,end=" ")
        inorder(root.right)
                
                
t=Trees()
t.add(5)
t.add(3)
t.add(8)

inorder(t.root)