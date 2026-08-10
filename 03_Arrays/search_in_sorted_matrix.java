public class search_in_sorted_matrix {
    public static void func(int[][] matrix ,int key){
        int col = 0 , row = matrix[0].length -1 ;
        for (int i = row ; i >= 0 ; i --){
            if(matrix[i][col] == key){
                System.out.println("Found at : " + i + " , " + col);
                return ;
            }
            else if(matrix[i][col] > key){
                continue ;
            }
            else{
                col ++ ;
                i ++ ;
            }
        } 

    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}} ;
        func(arr , 11);
    }
    
}
