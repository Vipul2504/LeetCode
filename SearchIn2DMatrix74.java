public class SearchIn2DMatrix74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 20;
        boolean ans = SearchIn2DMatrix(matrix,target);
        System.out.println(ans);
    }

    private static boolean SearchIn2DMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while(r < matrix.length && c >=0){
            if(matrix[r][c] == target){
                return true;
            }
            if(matrix[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return false;
    }
}  