public class pairs_in_array {
    
    public void findPairs(int arr[], int sum) {
        int n = arr.length;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pair found");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 6;
        pairs_in_array pa = new pairs_in_array();
        pa.findPairs(arr, sum);
    }
    
}
