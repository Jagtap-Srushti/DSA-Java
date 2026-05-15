package SlidingWindow;

//Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 
public class MinimumSizeSubarraySum {
    public static int minimumSizeSubArraySum(int arr[],int target){
        int n=arr.length;
        int minLength=Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];

            while(sum>=target){
                minLength=Math.min(minLength, right-left+1);
                sum-=arr[left];
                left++;
            }
        }

        return (minLength==Integer.MAX_VALUE)?0:minLength;
    }

    public static void main(String[] args) {
        int arr[]={2,3,1,2,4,3};
        int target=7;
        System.out.println(minimumSizeSubArraySum(arr, target));
    }
}
/*
Example:
target = 7
nums = [2,3,1,2,4,3]

Sliding Window Visualization

Step 1:
[2, 3, 1, 2, 4, 3]
 L
 R
SUM = 2

--------------------------------------------------

Step 2:
[2, 3, 1, 2, 4, 3]
 L  R
SUM = 5

--------------------------------------------------

Step 3:
[2, 3, 1, 2, 4, 3]
 L     R
SUM = 6

--------------------------------------------------

Step 4:
[2, 3, 1, 2, 4, 3]
 L        R
SUM = 8  >= 7

Valid window found
Window Length = 4

Shrink window from left:

[2, 3, 1, 2, 4, 3]
    L     R
SUM = 6

--------------------------------------------------

Step 5:
[2, 3, 1, 2, 4, 3]
    L        R
SUM = 10 >= 7

Shrink window:

[2, 3, 1, 2, 4, 3]
       L     R
SUM = 7

Window Length = 3

Shrink again:

[2, 3, 1, 2, 4, 3]
          L  R
SUM = 6

--------------------------------------------------

Step 6:
[2, 3, 1, 2, 4, 3]
          L     R
SUM = 9 >= 7

Shrink window:

[2, 3, 1, 2, 4, 3]
             L  R
SUM = 7

Window Length = 2

Shrink again:

[2, 3, 1, 2, 4, 3]
                L  R
SUM = 3

--------------------------------------------------

Final Answer:
Minimum Length = 2
Subarray = [4,3]

Time Complexity  : O(n)
Space Complexity : O(1)
*/