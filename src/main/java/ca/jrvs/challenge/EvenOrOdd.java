package ca.jrvs.challenge;

public class EvenOrOdd {
    /**
     * uses modulo to check if an int is even or odd
     * @param num
     * @return even or odd
     */
    public  static String Method1(int num ){
        if (num%2==0)
            return "EVEN";
        return "ODD";
    }

    /**
     * check if a number is even or odd with bit manipulation
     * @param num
     * @return even or odd
     */
  public static String Method2(int num ){
        if ((num & 1 )==0)
            return "EVEN";
        return "ODD";
  }
}
