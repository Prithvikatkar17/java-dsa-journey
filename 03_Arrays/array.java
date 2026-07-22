import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // creating an array 
        int arr[] = new int[5];

        int arr2[] = {1, 2, 3, 4, 5};

        String arr4[] = {"Hello", "World"};


        // inputting values in an array
        int arr3[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");

        arr3[0] = sc.nextInt();
        arr3[1] = sc.nextInt();
        arr3[2] = sc.nextInt();
        arr3[3] = sc.nextInt();
        arr3[4] = sc.nextInt();

        System.out.println("The numbers " + arr3[0] + " " + arr3[1] + " " + arr3[2] + " " + arr3[3] + " " + arr3[4]);
    }
}
