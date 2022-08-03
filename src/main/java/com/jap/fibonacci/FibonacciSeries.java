package com.jap.fibonacci;

public class FibonacciSeries
{
    private long fibonacci;

    // Write the logic in the method to generate the next number in the Fibonacci series

    public long fibonacci(long number) {
        return number-2;
    }
    // Print the series inside the method
    static long n1=0,n2=1,n3;
    public long printFibonacciSeries(long number){

       if(number>0) {
           n3 = n1 + n2;
           n1 = n2;
           n2 = n3;
           System.out.print(" " + n3);
           printFibonacciSeries(number-1);
       }
       return number;
    }
    public static void main( String[] args )
    {

        long number=10;

        FibonacciSeries fib = new FibonacciSeries();

        fib.printFibonacciSeries(number);

        //System.out.println(n1+" "+n2);
        //printFibonacciSeries(number-2);


    }
}
