public class LinkedListInsertion {
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

    public static Node insertAtBegining(Node head, int data){
      Node newNode = new Node(data);
      newNode.next = head;
      head = newNode;
      return head;
    }

    public static Node insertAtEnd(Node head, int data){
      if(head == null){
        return new Node(data);
      }
      Node temp = head;
      while(temp.next != null){
        temp = temp.next;
      }
      Node newNode = new Node(data);
      temp.next = newNode;
      return head;
    }

    public static Node insertAtPosition(Node head, int data, int position){
      if(position == 0){
        return insertAtBegining(head, data);
      }
      int count = 0;
      Node temp = head;
      while(temp != null){
        if(count == position - 1){
          Node newNode = new Node(data);
          newNode.next = temp.next;
          temp.next = newNode;
          break;
        }
        count++;
        temp = temp.next;
      }
      return head;
    }

    public static Node insertBeforeNode(Node head, int data, int target){
      if(head == null){
        return null;
      }
      if(head.data == target){
        return insertAtBegining(head, data);
      }
      Node temp = head;
      while(temp.next != null){
        if(temp.next.data == target){
          Node newNode = new Node(data);
          newNode.next = temp.next;
          temp.next = newNode;
          break;
        }
        temp = temp.next;
      }
      return head;
    }

  public static void main(String[] args) {
     int [] arr = {1, 2, 3, 4, 5};
      Node head = convertArrayToLinkedList(arr);
      printLinkedList(head); 
      head = insertAtBegining(head, 10);
      printLinkedList(head);
      head = insertAtEnd(head, 20);
      printLinkedList(head);
      head = insertAtPosition(head, 15, 3);
      printLinkedList(head);
      head = insertBeforeNode(head, 25, 4);
      printLinkedList(head);
  }
   
}

// https://www.geeksforgeeks.org/problems/linked-list-insertion-at-beginning/1
// https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1 - end
// https://www.geeksforgeeks.org/problems/insertion-at-a-given-position-in-a-linked-list/1

/*
// Python
class Node:
    def __inint__(self,data, next=None):
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

def insertAtBegining(head, data):
    newNode = Node(data)
    newNode.next = head
    head = newNode
    return head

def insertAtEnd(head, data):
    if head is None:
        return Node(data)
    temp = head
    while temp.next is not None:
        temp = temp.next
    newNode = Node(data)
    temp.next = newNode
    return head

def insertAtPosition(head, data, position):
    if position == 0:
        return insertAtBegining(head, data)
    count = 0
    temp = head
    while temp is not None:
        if count == position - 1:
            newNode = Node(data)
            newNode.next = temp.next
            temp.next = newNode
            break
        count += 1
        temp = temp.next
    return head

def insertBeforeNode(head, data, target):
    if head is None:
        return None
    if head.data == target:
        return insertAtBegining(head, data)
    temp = head
    while temp.next is not None:
        if temp.next.data == target:
            newNode = Node(data)
            newNode.next = temp.next
            temp.next = newNode
            break
        temp = temp.next
    return head

if __name__ == "__main__":
    arr = [1, 2, 3, 4, 5]
    head = convertArrayToLinkedList(arr)
    printLinkedList(head)
    head = insertAtBegining(head, 10)
    printLinkedList(head)
    head = insertAtEnd(head, 20)
    printLinkedList(head)
    head = insertAtPosition(head, 15, 3)
    printLinkedList(head)
    head = insertBeforeNode(head, 25, 4)
    printLinkedList(head)
*/