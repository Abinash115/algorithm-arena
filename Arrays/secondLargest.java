package Arrays;

public class secondLargest {
   
   public static int secondLargest(int[] arr){
      int largest = Integer.MIN_VALUE;
      int secondLaegest = Integer.MIN_VALUE;

      for(int i = 0; i < arr.length; i++){
          if(arr[i] > largest){
              secondLaegest = largest;
              largest = arr[i];
          }else if(arr[i] > secondLaegest && arr[i] != largest){
              secondLaegest = arr[i];
          }
      }
      return secondLaegest;
   }
   public static void main(String[] args) {
      int arr[] = {1, 2, 4, 7, 7, 5};
      System.out.println(secondLargest(arr));  // 5  Time complexity : O(N)  Space complexity : O(1)
   }
}

// https://www.geeksforgeeks.org/problems/second-largest3735/1
// https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1
