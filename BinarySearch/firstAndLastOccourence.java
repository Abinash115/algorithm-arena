package BinarySearch;

public class firstAndLastOccourence {
  public static int firstOccourence(int[] arr, int target){
    int low = 0;
    int high = arr.length - 1;
    int first = -1;
    while (low <= high){
      int mid = low + (high - low)/2;
      if(arr[mid] == target){
        first = mid;
        high = mid - 1;
      }else if(arr[mid] > target){
        high = mid - 1;
      }else{
        low = mid + 1;
      }
    }
    return first;
  }

  public static int lastOccourence(int[] arr, int target){
    int low = 0;
    int high = arr.length - 1;
    int last = -1;
    while (low <= high){
      int mid = low + (high - low)/2;
      if(arr[mid] == target){
        last = mid;
        low = mid + 1;
      }else if(arr[mid] > target){
        high = mid - 1;
      }else{
        low = mid + 1;
      }
    }
    return last;
  }

  public static int[] firstAndLastOccourence(int[] arr, int target){
    int first = firstOccourence(arr, target);
    if (first == -1) {
      return new int[]{-1, -1}; // Target not found
    }
    int last = lastOccourence(arr, target);
    return new int[]{first, last};
  }

  public static void main(String[] args) {
     int arr[] = {1, 2, 3, 3, 5, 8, 8, 10, 10, 11};
     int target =  3;
     
    System.out.println(firstOccourence(arr, target)); // 2
    System.out.println(lastOccourence(arr, target)); // 3
    System.out.println(firstAndLastOccourence(arr, target)); // 2 3
  }
}
