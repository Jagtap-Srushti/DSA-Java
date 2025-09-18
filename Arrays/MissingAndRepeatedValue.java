package Arrays;

public class MissingAndRepeatedValue {
    public static int[] MissingAndRepeated(int grid[][]){
        int n=grid.length;
        int total=n*n;
        int freq[]=new int[total+1];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                freq[grid[i][j]]++;
            }
        }

        int repeated=-1,missing=-1;

        for(int i=1;i<=total;i++){
            if(freq[i]==2){
                repeated=i;
            }
            else if(freq[i]==0){
                missing=i;
            }
        }

        return new int[]{repeated,missing};

    }
    public static void main(String[] args) {
        int grid[][]={{1,2},{3,2}};
        int result[]=MissingAndRepeated(grid);
        System.out.println("Repeated Number is:"+result[0]);
        System.out.println(("Missing Number is:"+result[1]));
    }
    
}
