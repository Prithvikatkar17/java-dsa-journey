

public class continue_statement {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) {
            if (count == 5) {
                continue; // Skip the rest of the loop when count is 5
            }
            System.out.println("Count: " + count);
        }
    }
}
