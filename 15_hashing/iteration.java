import java.util.HashMap;
import java.util.Set;
public class iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();   
        map.put("apple", 5);
        map.put("banana", 10);  
        map.put("orange", 15);
        map.put("grape", 20); 
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
    } 
}
