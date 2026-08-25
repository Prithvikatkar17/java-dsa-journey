public class find_permutations {
    public void permute(int[] arr, int index) {
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
            permute(arr, index + 1);
            // Backtrack: swap back to restore the original array
            swap(arr, index, i);
        }
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        find_permutations obj = new find_permutations();
        int[] arr = {1, 2, 3};
        obj.permute(arr, 0);
    }
}
