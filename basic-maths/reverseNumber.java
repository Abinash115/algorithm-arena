public class reverseNumber {
  public static int reverseNum(int n){
    int revNum = 0;
    while(n > 0){
      int ld = n % 10;
      revNum = (revNum * 10) + ld;
      n = n / 10;
    }
    return revNum;
  }

  public static void main(String[] args) {
    System.out.println(reverseNum(1234)); // 4321  // Time complexity : O(N)  Space complexity : O(1)
  }
}

// https://www.geeksforgeeks.org/problems/reverse-digit0316/1