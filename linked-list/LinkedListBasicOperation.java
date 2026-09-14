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
