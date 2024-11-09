public class FibonacciRecursive{
    public static void main(String [] args){
        int n = 20;

        for (int i = 1; i <= n; i++){
            long f = fib(i);
            System.out.println("fib(" + i + ") = " + f);
        }   
    }
    public static long fib(int n){
            if (n <= 2) {return 1;}
            else { return fib(n-1) + fib(n-2);}
        }
}