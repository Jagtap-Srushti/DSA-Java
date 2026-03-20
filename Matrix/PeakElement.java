package Matrix;

//Given a 0-indexed n x m matrix mat where no two adjacent cells are equal, find any peak elementA peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbours to the left, right, top, and bottom..

public class PeakElement {
    public static int peak(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int peak=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]>peak){
                    peak=matrix[i][j];
                }
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        int matrix[][]={
            {10,20,15},
            {21,30,14},
            {7,16,32}};

            System.out.println(peak(matrix));
        
    }

    
}