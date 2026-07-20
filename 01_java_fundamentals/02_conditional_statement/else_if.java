public class else_if {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < c) {
            System.out.println("a is less than c");
        } else {
            System.out.println("None of the conditions are true");
        }
    }
}
