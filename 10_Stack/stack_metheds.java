import java.util.*;
public class stack_metheds {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>() ;
        stack.push(1) ;
        stack.push(2) ;
        stack.push(3) ;

        System.out.println(stack.peek()) ; // 3
        System.out.println(stack.pop()) ; // 3
        System.out.println(stack.peek()) ; // 2
        System.out.println(stack.isEmpty()) ; // false


        stack.push(4);          // Add 4
        stack.pop();            // Remove top
        System.out.println(stack.peek());           // Get top
        System.out.println(stack.isEmpty());        // true / false
        System.out.println(stack.size());           // Size
        System.out.println(stack.search(2));        // Position from top
        System.out.println(stack.contains(2));      // Exists?
        System.out.println(stack.get(0));            // Get index
        stack.set(0, 5);         // Replace index
        stack.clear();           // Remove everything
        System.out.println(stack.empty());           // Check empty
    }
}
