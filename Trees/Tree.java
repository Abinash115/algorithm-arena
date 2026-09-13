package Trees;

public class Tree {
   public static class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    } 
   }

   public static void preOrder(Node root){
    if(root == null){
      return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
   }

   public static void inOrder(Node root){
    if(root == null){
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
   }

   public static void postOrder(Node root){
    if(root == null){
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
   }

   public static void main(String[] args){
      Node root = new Node(4);
      root.left = new Node(2);
      root.right = new Node(5);
      root.left.left = new Node(3);
      root.left.left.right = new Node(9);
      root.left.left.right.left= new Node(1);
      root.right.left  = new Node(7);
      root.right.right = new Node(6);
      root.right.right.left = new Node(8);
      preOrder(root);
      System.out.println();
      inOrder(root);
      System.out.println();
      postOrder(root);
   }
}

/*  
// Python
class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def preOrder(root):
    if root is None:
        return                        
    print(root.data, end=" ")
    preOrder(root.left)
    preOrder(root.right)

def inOrder(root):
    if root is None:  
        return
    inOrder(root.left)
    print(root.data, end=" ")
    inOrder(root.right)

def postOrder(root):
    if root is None:
        return
    postOrder(root.left)
    postOrder(root.right) 
    print(root.data, end=" ")

if __name__ == "__main__":
    root = Node(4)
    root.left = Node(2)
    root.right = Node(5)
    root.left.left = Node(3)
    root.left.left.right = Node(9)
    root.left.left.right.left= Node(1)
    root.right.left  = Node(7)
    root.right.right = Node(6)
    root.right.right.left = Node(8)

    preOrder(root)
    print()
    inOrder(root)
    print()
    postOrder(root)

// JavaScript
class Node{ 
  
    constructor(data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
} 

function preOrder(root){
    if(root === null){
        return;
    }
    console.log(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
} 

function inOrder(root){
    if(root === null){
        return;
    }
    inOrder(root.left);
    console.log(root.data + " ");
    inOrder(root.right);
}

function postOrder(root){
    if(root === null){
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    console.log(root.data + " ");
}

function main(){
    let root = new Node(4);
    root.left = new Node(2);
    root.right = new Node(5);
    root.left.left = new Node(3);
    root.left.left.right = new Node(9);
    root.left.left.right.left= new Node(1);
    root.right.left  = new Node(7);
    root.right.right = new Node(6);
    root.right.right.left = new Node(8);

    preOrder(root);
    console.log();
    inOrder(root);
    console.log();
    postOrder(root);
}


*/
