import java.util.*;

public class revers_a_stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>() ;
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        printStack(s);
        reverrsStack(s);
        printStack(s);
    }
    public static void pushAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int temp = s.pop() ;
        pushAtBottom(s, data);
        s.push(temp) ;
    }
    public static void reverrsStack(Stack<Integer> s ){
        
        if(s.isEmpty()){
            return ;
        }
        int temp = s.pop() ;
        reverrsStack(s);
        pushAtBottom(s, temp);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek()) ;
            s.pop();
        }
    }
}
