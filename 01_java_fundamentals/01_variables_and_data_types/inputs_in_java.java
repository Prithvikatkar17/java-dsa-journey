import java.util.*;


public class inputs_in_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(input);

        int number = sc.nextInt();
        System.out.println(number);

        float decimal = sc.nextFloat();
        System.out.println(decimal);    

        boolean bool = sc.nextBoolean();
        System.out.println(bool);

        sc.close();
    }
}