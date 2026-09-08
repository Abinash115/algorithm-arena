package Arrays;

import java.util.Arrays;

public class largestElement {
   static int largest(int arr[]){
      int max = arr[0];
      for(int i = 1; i < arr.length; i++){
          if(arr[i] > max){
             max = arr[i];
          }
      }
      return max;
   }

   static int largestBrute(int arr[]){
      Arrays.sort(arr);
      return arr[arr.length - 1];
   }
  public static void main(String[] args){
     int arr[] = {1, 2, 3, 4, 5};
     System.out.println(largest(arr)); // 5  Time complexity : O(N)  Space complexity : O(1)
     System.out.println(largestBrute(arr)); // 5  Time complexity : O(NlogN)  Space complexity : O(1)
  }
}

// https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
