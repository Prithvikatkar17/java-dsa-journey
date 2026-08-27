import java.util.ArrayList;

public class multidimentional_arraylist {

    public static void main(String[] args) {
        // Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Add rows to the 2D ArrayList
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(i * 3 + j + 1); // Fill with numbers 1 to 9
            }
            matrix.add(row);
        }

        // Print the 2D ArrayList
        for (ArrayList<Integer> row : matrix) {
            System.out.println(row);
        }
    }
}