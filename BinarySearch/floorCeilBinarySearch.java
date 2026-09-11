package BinarySearch;

public class floorCeilBinarySearch {
    public static int floor(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int floor = -1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] > target){
                high = mid - 1;
            }else{
                floor = arr[mid];
                low = mid + 1;
            }
        }
        return floor;
    }

    public static int ceil(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int ceil = -1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                ceil = arr[mid];
                high = mid - 1;
            }
        }
        return ceil;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;
        System.out.println(floor(arr, target)); // 2
        System.out.println(ceil(arr, target)); // 8
    }
}

// https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
// https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1
