
public class problem_2 {
    public static void main(String[] args) {
        print(10);
    }

    public static void  print(int n) {
        if(n == 1){
            System.out.println(1 );
            return;
        }
        print(n-1);
        System.err.println(n);

        
    }
}


