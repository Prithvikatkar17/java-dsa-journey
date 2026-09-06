import  java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 5);
        map.put("banana", 10);
        System.out.println(map.get("apple"));
        System.out.println(map.get("banana"));


         HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 5);
        map1.put("banana", 10);
        System.out.println(map1.get("apple"));
        System.out.println(map1.get("banana"));

        map1.remove("orange");
        System.out.println(map1.containsKey("orange"));
        System.out.println(map1.containsValue(15));

        System.out.println(map1.size());
        System.out.println(map1.isEmpty()); 

       

    }
    // hashmap methods
    // put(K key, V value)
    // get(Object key)
    // remove(Object key)
    // containsKey(Object key)
    // containsValue(Object value)
    // size()
    // isEmpty()
    // clear()

    // example of hashmap methods
   

     
}
