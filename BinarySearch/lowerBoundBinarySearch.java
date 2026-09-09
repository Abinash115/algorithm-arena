package BinarySearch;

public class lowerBoundBinarySearch {
  public static int lowerBinary(int[] arr, int target){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] >= target){
        return i;
      }
    }
    return arr.length;
  }
  public static int lowerBinarySearch(int[] arr, int target){
    int low = 0;
    int high = arr.length - 1;
    int ans = arr.length;
    while (low <= high){
      int mid = low + (high - low)/2;
      if(arr[mid] == target){
        return mid;
      }else if(arr[mid] >= target){
        ans = mid;
        high = mid - 1;
      }else{
        low = mid + 1;
      }
    }
    return ans;
  }
   public static void main(String[] args) {
    int arr[] = {1, 2, 3, 3, 5, 8, 8, 10, 10, 11};
    int target =  9;
    System.out.println(lowerBinary(arr, target)); // 7 Time complexity : O(N)  Space complexity : O(1)
    System.out.println(lowerBinarySearch(arr, target)); // 7 Time complexity : O(logN)  Space complexity : O(1)
  }
}
