import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted in ascending order: " + numbers);

        // Sort the ArrayList in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted in descending order: " + numbers);
    }
}
