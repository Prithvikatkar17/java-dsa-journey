public class unary_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        // Unary plus operator
        int c = +a;
        System.out.println("Unary plus of a: " + c);

        // Unary minus operator
        int d = -b;
        System.out.println("Unary minus of b: " + d);

        // Increment operator
        a++;
        System.out.println("Incremented value of a: " + a);

        // Decrement operator
        b--;
        System.out.println("Decremented value of b: " + b);
    }
    
}
