

public class subsrings {
    public static void generateSubstrings(String str, int index, String current) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Include the current character
        generateSubstrings(str, index + 1, current + str.charAt(index));

        // Exclude the current character
        generateSubstrings(str, index + 1, current);
    }
    public static void main(String[] args) {
        String str = "abc";
        generateSubstrings(str, 0, "");
    }
}
