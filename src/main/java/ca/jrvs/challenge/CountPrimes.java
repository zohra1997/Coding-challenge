package ca.jrvs.challenge;

import java.util.ArrayList;

public class CountPrimes {
    public static int countPrimes(int n){
        ArrayList<Integer> primes = new ArrayList<>();
        int count = 0;
        for (int i = 0; i<=n;i++){
            if (IsPrime(i)){
                count ++;
                primes.add(i);

            }

        }
        System.out.println(primes);
        return count ;
    }
    protected static boolean IsPrime(int num){
        int count = 0;
        for (int i =1 ;i<=num ; i++){
            if (num%i==0){
                count ++;
            }
        }
      return (count==2);
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
