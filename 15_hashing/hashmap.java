import  java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 5);
        map.put("banana", 10);
        System.out.println(map.get("apple"));
        System.out.println(map.get("banana"));
    }
}
