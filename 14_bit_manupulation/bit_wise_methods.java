
public class bit_wise_methods {
    public static void main(String[] args) {
         
        int a = 5; // 0101
        int b = 3; // 0011

        System.out.println(a & b); // Bitwise AND
        System.out.println(a | b); // Bitwise OR
        System.out.println(a ^ b); // Bitwise XOR
        System.out.println(~a);    // Bitwise NOT
        System.out.println(a << 1); // Left shift
        System.out.println(a >> 1); // Right shift
    }
}
