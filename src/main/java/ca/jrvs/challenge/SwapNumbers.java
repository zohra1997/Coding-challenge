package ca.jrvs.challenge;

public class SwapNumbers {
    /**
     * swaps between two numbers with out using third variable
     * @param a
     * @param b
     */
    public static void function (int a , int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: "+a  +" b: "+ b);
    }

    public static void main(String[] args) {
        function(5,9);
    }
}
