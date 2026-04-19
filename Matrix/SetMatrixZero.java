package Matrix;


//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.


public class SetMatrixZero{

    public static void setZero(int matrix[][]){
        int m=matrix.length;
        int n=matrix[0].length;

        boolean firstRow=false;
        boolean firstCol=false;

        for(int i=0;i<n;i++){
            if(matrix[0][i]==0){
                firstRow=true;
            }
        }

        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstCol=true;
            }
        }


        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }


        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if(firstRow){
            for(int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }

        if(firstCol){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }

    public static void printMatrix(int matrix[][]){
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
    }
    public static void main(String[] args){
        int matrix[][]={
            {1,2,3,4,5} ,
            {6,0,8,9,10} , 
            {11,12,13,0,15},
            {16,17,18,19,20}

        };

        System.out.println("OriginalMAtrix:-");
        printMatrix(matrix);
        setZero(matrix);

        System.out.println("Matrix After reset:-");
        printMatrix(matrix);





    }
}