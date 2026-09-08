public class PalindromeNumber {

  public static boolean isPalindrome(int n){
    int revNum = 0;
    int dup = n;

    while(dup > 0){
      int ld = dup % 10;
      revNum = (revNum * 10) + ld;
      dup = dup / 10;
    }
    if(n == revNum){
      return true;
    }else{
      return false;
    }

  }
  public static void main(String[] args) {
    System.out.println(isPalindrome(121)); // true  Time complexity : O(N)  Space complexity : O(1)
  }
}

// https://leetcode.com/problems/palindrome-number/