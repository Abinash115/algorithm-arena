public class LinkedList{
  public static class Node{
      int data;
      Node next;

      public Node(int data){
        this.data = data;
        this.next = null;
      }

      public Node(int data, Node next){
        this.data = data;
        this.next = next;
      }
   }
   public static void main(String[] args){
     int [] arr = {1, 2, 3, 4, 5};
     Node head = new Node(arr[0]);
     System.out.println(head.data);
   }
}

/*
// Python
class Node:
    def __init__(self,data, next=None):
        self.data = data
        self.next = next

    if __name__ == "__main__":
        arr = [1,2,3,4,5]
        head = Node(arr[0])
        print(head.data)


// JavaScript
class Node{
    Constructor(data, next = null){
        this.data = data;
        this.next = next;
    }
}

function main(){
    let arr = [1,2,3,4,5];
    let head = new Node(arr[0]);
    console.log(head.data);
}

*/