package Arrays;

public class checkArraySorted {
   public boolean isSorted(int[] arr) {
        for(int i = 1;  i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public boolean isSortedSecond(int[] arr){
        for(int i = 0; i < arr.length; i++){
          for(int j = i + 1; j < arr.length; j++){
            if(arr[i] > arr[j]){
                return false;
            }
          }
        }
        return true;
    }
   public static void main(String[] args){
      int arr[] = {1, 2, 3, 4, 5};
      System.out.println(new checkArraySorted().isSortedSecond(arr));  // true  Time complexity : O(N^2)  Space complexity : O(1)
      System.out.println(new checkArraySorted().isSorted(arr));  // true  Time complexity : O(N)  Space complexity : O(1)
      
   }
}

// https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
