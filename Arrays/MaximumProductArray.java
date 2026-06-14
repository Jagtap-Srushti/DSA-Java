package Arrays;

public class MaximumProductArray {

    public static int maxProduct(int arr[]){
        int n=arr.length;
        int maxProduct=arr[0];
        int minproduct=arr[0];
        int ans=arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]<0){
                int temp=maxProduct;
                maxProduct=minproduct;
                minproduct=temp;
            }

            maxProduct=Math.max(arr[i], maxProduct*arr[i]);
            minproduct=Math.min(arr[i], minproduct*arr[i]);
            ans=Math.max(ans, maxProduct);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, -2, 4, -1 };
        System.out.println(maxProduct(arr));
    }
}

// // Since a negative number flips the sign of a product, the current maximum product can become the minimum product, and the current minimum product can become the maximum product. Therefore, I track both values. Whenever I see a negative number, I swap them because their roles are about to reverse.
// When multiplying by a positive number:

// Largest stays largest
// Smallest stays smallest

// When multiplying by a negative number:

// Largest becomes smallest
// Smallest becomes largest