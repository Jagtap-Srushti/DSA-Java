package Matrix;
public class TransposeOfMatrix {

    public static int[][] transposeOfMatrix(int matrix[][]){
        int m=matrix.length;
        int n=matrix[0].length;
        //create new matrix
        int curr[][]=new int[n][m];//dimension also swapped

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                curr[i][j]=matrix[j][i];
            }
        }

        return curr;
    }

    public static void printMatrix(int matrix[][]){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printMatrix(matrix);
        printMatrix(transposeOfMatrix(matrix));
    }
    
}
