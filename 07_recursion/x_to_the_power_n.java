public class x_to_the_power_n {
    public static void main(String[] args) {
        x_to_the_power_n obj = new x_to_the_power_n();
        System.out.println(obj.power(2, 3)); // Output: 8
    }
    public int power(int x , int n){
        if(n == 0){
            return 1;
        }
        return x * power(x , n-1);
    }
}
