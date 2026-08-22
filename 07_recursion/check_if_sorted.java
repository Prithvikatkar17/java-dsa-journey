public class check_if_sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,9} ;
        boolean result = check(arr ,0);
        System.out.println("Is the array sorted? " + result);
        
    }
    public static boolean check(int arr[] ,int i){
        if(i == arr.length -1){
            return true ;
        }
        if(arr[i]>arr[i+1]){
            return false ;
        }
        return check(arr , i+1);
       
    }
}
