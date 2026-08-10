public class spiral_matrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {0,9,8,7},
                        {6,5,4,3}} ;
        int sr = 0 ;
        int sc = 0 ;
        int er = arr.length -1 ;
        int ec = arr[0].length -1 ;
        while(sr < er && sc < ec){
            for(int i = sc ;i<=ec ;i++){
                System.out.println(arr[sr][i]);
            }
            for(int i = sr +1 ;i<=er ;i++){
                System.out.println(arr[i][ec]);
            }
            for(int i = ec-1 ;i>=sc ;i--){
                System.out.println(arr[er][i]);
            }
            for(int i = er -1 ;i>=sr+1 ;i--){
                System.out.println(arr[i][sc]);
            }
            sc ++;
            sr ++ ;
            er -- ;
            ec -- ;
        }
    }
}
