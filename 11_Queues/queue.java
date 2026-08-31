import java.util.*;
public class queue {
    public static void pushAtBottom(Queue<Integer> q , int data){
        if(q.isEmpty()){
            q.add(data);
            return ;
        }
        int temp = q.remove() ;
        pushAtBottom(q, data);
        q.add(temp) ;
    }
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>() ;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        pushAtBottom(q, 5);
        printQueue(q);
    }

    
    public static void printQueue(Queue<Integer> q){
        while(!q.isEmpty()){
            System.out.println(q.peek()) ;
            q.remove();
        }
    }
}