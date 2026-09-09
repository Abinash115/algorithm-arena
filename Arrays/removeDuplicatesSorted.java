package Arrays;

import java.util.HashSet;

public class removeDuplicatesSorted {
   public static int removeDuplicates(int[] arr){
      if(arr.length == 0){
         return 0;
      }
      int j = 0;
      for(int i = 1; i < arr.length; i++){
         if(arr[i] != arr[j]){
            j++;
            arr[j] = arr[i];
         }
      }
      return j + 1;
   }

   public static int removeDuplicatesBruteForce(int[] arr){
      HashSet<Integer> set = new HashSet<>();
      for(int i = 0; i < arr.length; i++){
          set.add(arr[i]);
      }
      int j = 0;
      for(int num : set){
          arr[j++] = num;
      }
      return j;
   }

   public static void main(String[] args) {
      int arr[] = {1, 2, 2, 3, 4, 4, 5};
      int n = removeDuplicates(arr);
      for(int i = 0; i < n; i++){
         System.out.print(arr[i] + " ");  // 1 2 3 4 5  Time complexity : O(N)  Space complexity : O(1)
      }

      System.out.println();
      int arr2[] = {1, 2, 2, 3, 4, 4, 5};
      int n2 = removeDuplicatesBruteForce(arr2);
      for(int i = 0; i < n2; i++){
         System.out.print(arr2[i] + " ");  // 1 2 3 4 5  Time complexity : O(NlogN + N)  Space complexity : O(N)
      }
   }
}

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
