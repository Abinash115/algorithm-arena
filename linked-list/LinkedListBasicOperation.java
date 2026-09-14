public class LinkedListBasicOperation {
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

    public static Node convertArrayToLinkedList(int[] arr){
      if(arr.length == 0){
        return null;
      }
      Node head = new Node(arr[0]);
      Node mover = head;
      for(int i = 1; i < arr.length; i++){
        Node temp = new Node(arr[i]);
        mover.next = temp;
        mover = temp;
      }
      return head;
    }

    public static void printLinkedList(Node head){
      Node temp = head;
      while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    }

    public static int lengthOfLinkedList(Node head){
      int count = 0;
      Node temp = head;
      while(temp != null){
        count++;
        temp = temp.next;
      }
      return count;
    }

    public static int searchInLinkedList(Node head, int target){
      Node temp = head;
      int index = 0;
      while(temp != null){
        if(temp.data == target){
          return index;
        }
        temp = temp.next;
        index++;
      }
      return 0;
    }
   public static void main(String[] args){
      int [] arr = {1, 2, 3, 4, 5};
      Node head = convertArrayToLinkedList(arr);
      printLinkedList(head);
      System.out.println(lengthOfLinkedList(head));
      int target = 3;
      System.out.println(searchInLinkedList(head, target));
   }
}

/*
// Python
class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next

def convertArrayToLinkedList(arr): 
    if len(arr) == 0:
        return None
    head = Node(arr[0])
    mover = head
    for i in range(1, len(arr)):
        temp = Node(arr[i])
        mover.next = temp
        mover = temp
    return head

def printLinkedList(head):
    temp = head
    while temp is not None:
        print(temp.data, end=" ")
        temp = temp.next
    print()

def lengthOfLinkedList(head):
    count = 0
    temp = head
    while temp is not None:
        count += 1
        temp = temp.next
    return count

def searchInLinkedList(head, target):
    temp = head
    index = 0
    while temp is not None:
        if temp.data == target:
            return index
        temp = temp.next
        index += 1
    return -1

if __name__ == "__main__":
    arr = [1, 2, 3, 4, 5]
    head = convertArrayToLinkedList(arr)
    printLinkedList(head)
    print(lengthOfLinkedList(head))
    target = 3
    print(searchInLinkedList(head, target))

// JavaScript
class Node{
    constructor(data, next = null){
        this.data = data;
        this.next = next;
    }
}

function convertArrayToLinkedList(arr){
    if(arr.length === 0){
        return null;
    }
    let head = new Node(arr[0]);
    let mover = head;
    for(let i = 1; i < arr.length; i++){
        let temp = new Node(arr[i]);
        mover.next = temp;
        mover = temp;
    }
    return head;
}

function printLinkedList(head){
    let temp = head;
    while(temp !== null){
        console.log(temp.data + " ");
        temp = temp.next;
    }
    console.log();
}

function lengthOfLinkedList(head){
    let count = 0;
    let temp = head;
    while(temp !== null){
        count++;
        temp = temp.next;
    }
    return count;
}

function searchInLinkedList(head, target){
    let temp = head;
    let index = 0;
    while(temp !== null){
        if(temp.data === target){
            return index;
        }
        temp = temp.next;
        index++;
    }
    return -1;
}

function main(){
    let arr = [1, 2, 3, 4, 5];
    let head = convertArrayToLinkedList(arr);
    printLinkedList(head);
    console.log(lengthOfLinkedList(head));
    let target = 3;
    console.log(searchInLinkedList(head, target));
}
*/
