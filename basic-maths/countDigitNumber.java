public class countDigitNumber {
  
  static int countDigits(int n){
    int count = 0;
    while(n > 0){
      n = n / 10;
      count++;
    }
    return count;
  }

  static int countDigitsRecursion(int n){
    if(n == 0){
      return 0;
    }
    return 1 + countDigitsRecursion(n / 10);
  }

  static int countDigitsLog(int n){
    if(n == 0){
      return 0;
    }
    return (int)(Math.log10(n) + 1);
  }

    
  public static void main(String[] args){
    int n  = 7789;
    System.out.println(countDigits(n));   // Time complexity : O(N)  Space complexity : O(1)
    System.out.println(countDigitsRecursion(n));  // Time complexity : O(N) Space complexity : O(N)
    System.out.println(countDigitsLog(n));  // Time complexity : O(log10(N)) Space complexity : O(1)
  }
}
