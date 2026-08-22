
public class febonachi {
    public static void main(String[] args) {
        int n = 20;
        int result = fib(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
    }
    public static int fib(int n) {
        if(n == 1 || n == 0){
            return n;
        } else {
            return fib(n-1) + fib(n-2); 
        }
    }
}
