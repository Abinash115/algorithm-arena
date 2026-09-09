package BinarySearch;

public class binarySearch {

  public static int binarySearch(int[] arr, int target){
    int low = 0;
    int high = arr.length - 1;
    while (low <= high){
      int mid = low + (high - low)/2;
      if(arr[mid] == target){
        return mid;
      }else if(arr[mid] > target){
        high = mid - 1;
      }else{
        low = mid + 1;
      }
    }
    return -1;
  }

  public static int binarySearchRecursive(int[] arr, int target, int low, int high){
    if(low > high){
      return -1;
    }
    int mid = low + (high - low)/2;
    if(arr[mid] == target){
      return mid;
    }else if(arr[mid] > target){
      return binarySearchRecursive(arr, target, low, mid - 1);
    }else{
      return binarySearchRecursive(arr, target, mid + 1, high);
    }
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int target = 5;
    System.out.println(binarySearch(arr, target)); // 4 Time complexity : O(logN)  Space complexity : O(1)
    System.out.println(binarySearchRecursive(arr, target, 0, arr.length - 1)); // 4 Time complexity : O(logN)  Space complexity : O(logN)
  }
}

// https://leetcode.com/problems/binary-search/submissions/2135769359/
