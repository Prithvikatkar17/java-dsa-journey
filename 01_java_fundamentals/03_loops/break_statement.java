
public class break_statement {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) {
            if (count == 5) {
                break; // Exit the loop when count is 5
            }
            System.out.println("Count: " + count);
        }
    }
}
