package _3_Recursion;

public class _2_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    static int fibo(int n )
    {
        //Base Condition that Tell recursion when to stop.
        if( n < 2)
        {
            return n;
        }
       return fibo(n-1) + fibo(n-2);
    }
}
