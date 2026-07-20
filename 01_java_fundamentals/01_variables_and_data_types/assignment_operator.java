public class assignment_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        // Assignment operator
        a += 5; // equivalent to a = a + 5
        System.out.println("After a += 5, value of a: " + a);

        b -= 10; // equivalent to b = b - 10
        System.out.println("After b -= 10, value of b: " + b);

        a *= 2; // equivalent to a = a * 2
        System.out.println("After a *= 2, value of a: " + a);

        b /= 2; // equivalent to b = b / 2
        System.out.println("After b /= 2, value of b: " + b);

        a %= 3; // equivalent to a = a % 3
        System.out.println("After a %= 3, value of a: " + a);
    }
    
}
