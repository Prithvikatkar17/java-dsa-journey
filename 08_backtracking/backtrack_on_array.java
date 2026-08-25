
public class backtrack_on_array {

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void backtrack(int[] arr, int index) {
        if (index == arr.length) {
            // Base case: print the current permutation
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = index; i < arr.length; i++) {
            // Swap the current index with the loop index
            swap(arr, index, i);
            // Recur with the next index
            backtrack(arr, index + 1);
            // Backtrack: swap back to restore the original array
            swap(arr, index, i);
        }

    }
    public static void main(String[] args) {
        backtrack_on_array obj = new backtrack_on_array();
        int[] arr = {1, 2, 3};
        obj.backtrack(arr, 0);
    }
}
