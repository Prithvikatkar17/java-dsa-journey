public class first_ocurance {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,23,6,7,86,77};
    System.err.println("found 86 at index :" + oc(arr ,86 ,0));
    }

    public static int oc(int arr[] , int n , int i){
        if(i == arr.length){
            return -1 ;
        }
        if(arr[i] == n){
            return i;
        }
        return oc(arr ,n, i+1);
    }
    

}