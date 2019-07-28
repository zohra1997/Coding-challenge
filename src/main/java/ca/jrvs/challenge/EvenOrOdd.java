package ca.jrvs.challenge;

public class EvenOrOdd {
    public  static String Method1(int num ){
        if (num%2==0)
            return "EVEN";
        return "ODD";
    }

  public static String Method2(int num ){
        if ((num & 1 )==0)
            return "EVEN";
        return "ODD";
  }
}
