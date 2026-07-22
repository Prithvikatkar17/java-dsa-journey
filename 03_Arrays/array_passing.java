

public class array_passing {

    public static void arrpass (int marks[]){
        for (int i =0 ; i < marks.length;i++){
            marks[i] = marks[i] + 1 ;
        }
    }
    public static void main(String[] args) {
        int marks[] = {100 ,100 ,100};
        arrpass(marks);

        for(int i =0 ; i < marks.length ; i++){
            System.out.println(marks[i]);
        }
    }
    
}
