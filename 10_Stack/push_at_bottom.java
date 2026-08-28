import java.util.*;

public class push_at_bottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>() ;
        s.push(1) ;
        s.push(2) ;
        s.push(3) ;
        s.push(4) ;
        s.push(5) ;

        pushAtBottom(s, 0) ;

        while(!s.isEmpty()){
            System.out.println(s.peek()) ;
            s.pop() ;
        }
        
    }
    public static void pushAtBottom(Stack<Integer> s ,int data){
        if(s.isEmpty()){
            s.push(data) ;
            return ;
        }
        int temp = s.pop() ;
        pushAtBottom(s, data);
        s.add(temp);
    }
}
