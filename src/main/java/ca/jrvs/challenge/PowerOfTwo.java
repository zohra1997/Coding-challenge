package ca.jrvs.challenge;

public class PowerOfTwo {
    public static boolean powerOfTwo(int number) {
        int square = 1;
        while (number >= square) {
            if (number == square) {
               return true;
            }
            square= square*2;
        }
        return  false;
    }

    public  static boolean isPower(int num){
        if (num<0){
            throw new IllegalArgumentException("Illegal number");
        }
        return ((num & -num )== num);

    }
    public static void main(String[] args) {
        System.out.println(powerOfTwo(16));
        System.out.println(isPower(18) );
    }
}
