package Arrays;

public class linearSearch {
   public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        System.out.println(linearSearch(arr, target)); // 4 Time complexity : O(N)  Space complexity : O(1)
    }
}

// 
