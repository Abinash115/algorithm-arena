package BinarySearch;

public class searchInsertPosition {
   public static int searchInsert(int[] arr, int target){
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
        int arr[] = {1, 2, 4, 7};
        int target = 6;
        System.out.println(searchInsert(arr, target)); // 3
    }
}

// https://leetcode.com/problems/search-insert-position/description/
