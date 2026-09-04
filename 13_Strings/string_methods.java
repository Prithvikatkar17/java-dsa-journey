
public class string_methods {
    public static void main(String[] args) {
        String s = "Hello World";

            s.length();                 // Length
            s.charAt(0);                // Character
            s.substring(0);             // Substring
            s.substring(0, 5);          // Substring
            s.equals("Hello");           // Compare
            s.equalsIgnoreCase("hello"); // Compare ignoring case
            s.indexOf('a');             // First occurrence
            s.lastIndexOf('a');         // Last occurrence
            s.contains("abc");          // Contains
            s.startsWith("abc");        // Starts with
            s.endsWith("abc");          // Ends with
            s.toCharArray();            // String → char[]
            s.toUpperCase();            // Uppercase
            s.toLowerCase();            // Lowercase
            s.trim();                   // Remove spaces
            s.replace('a', 'b');        // Replace
            s.split(" ");               // Split
    }
}
