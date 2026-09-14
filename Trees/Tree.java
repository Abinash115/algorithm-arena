package Trees;
import java.util.*;

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

   public static List<List<Integer>> levelOrder(Node root){
    List<List<Integer>> ans = new ArrayList<>();
      if(root == null){
         return ans;
      }
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
         int size = q.size();
         List<Integer> level = new ArrayList<>();
         for(int i = 0; i < size; i++){
            Node curr = q.poll();
            level.add(curr.data);
            if(curr.left != null){
               q.add(curr.left);
            }
            if(curr.right != null){
               q.add(curr.right);
            }
         }
         ans.add(level);
      }
      return ans;
   }

   public static List<Integer> inorderTraversal(Node root) {
        List<Integer> inorder = new ArrayList<>();
        Stack<Node> st = new Stack<Node>();
        Node node = root;
        while(true){
            if(node != null){
                st.push(node);
                node = node.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }else{
                    node = st.pop();
                    inorder.add(node.data);
                    node = node.right;
                }
            }
        }
        return inorder;
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
      System.out.println();
      // List<List<Integer>> ans = levelOrder(root);
      // for(List<Integer> level : ans){
      //    System.out.println(level);
      // }
      System.out.println(inorderTraversal(root));
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

https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/2141109092/
https://leetcode.com/problems/binary-tree-inorder-traversal/description/
https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/2141111055/
https://leetcode.com/problems/binary-tree-level-order-traversal/submissions/2141117338/
*/
