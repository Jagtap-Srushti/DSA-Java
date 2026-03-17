package BinarySearch;

// You have been given a non-empty grid ‘mat’ with 'n' rows and 'm' columns consisting of only 0s and 1s. All the rows are sorted in ascending order. Your task is to find the index of the row with the maximum number of ones. Note: If two rows have the same number of ones, consider the one with a smaller index. If there's no row with at least 1 zero, return -1

public class RowWithMax1InMatrix {
    public static int maxOne(int arr[][]){
        int m=arr.length;  //No. of row
        int n=arr[0].length;  //NO. OF COLUMN

        int max_One=-1;
        int index=-1;
        for(int i=0;i<m;i++){
            int one_count=0;
            for(int j=0;j<n;j++){
                one_count+=arr[i][j];
                if(one_count>max_One){  //IF Row hax max 1s then previous 
                    max_One=one_count;      //update max count
                    index=i;  //store index of current row
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {

        int arr[][]={
            {0,0,0,1},
            {0,1,1,1},
            {0,0,1,1},
            {0,1,1,1},
        };
        System.out.println(maxOne(arr));
        
    }
    
}
