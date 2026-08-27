import java.util.ArrayList;
public class syntax {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(1, 11) ;

        //get the element at index 1
        int element = numbers.get(1);
        System.out.println(element);

        // Remove the element at index 0
        numbers.remove(0);
        System.out.println(numbers);

        // set the element at index 0 to 20
        numbers.set(0, 20);
        System.out.println(numbers);

        // check if the ArrayList contains the element 20
        boolean contains20 = numbers.contains(20);
        System.out.println(contains20);

        //size of the ArrayList
        int size = numbers.size();
        System.out.println(size);

        // Clear the ArrayList
        numbers.clear();
        System.out.println(numbers);

        // Check if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println(isEmpty);
         
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print the ArrayList
        System.out.println(fruits);
    }
    
}
