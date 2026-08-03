import java.util.Arrays;

public class representation {
    public static void main(String[] args) {
        // 2D array representation
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Using Arrays.deepToString() to print the 2D array
        System.out.println("Using Arrays.deepToString():");
        System.out.println(Arrays.deepToString(arr));
    }
}
