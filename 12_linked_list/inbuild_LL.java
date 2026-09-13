import java.util.*;
public class inbuild_LL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>() ;

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);

        // methods of LinkedList

        ll.removeFirst();
        ll.removeLast();    

        System.out.println(ll);
    }
}
