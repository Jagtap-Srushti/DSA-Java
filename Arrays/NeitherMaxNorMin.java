package Arrays;
public class NeitherMaxNorMin {

    public static int nonMaxOrMon(int nums[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int num:nums){
            min=Math.min(min, num);
            max=Math.max(max, num);
        }

        for(int num:nums){
            if(num!=min && num!=max){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,3,7,11};
        System.out.println("Neither maximum nor minimum element in array is:"+nonMaxOrMon(nums));
        
    }
}
