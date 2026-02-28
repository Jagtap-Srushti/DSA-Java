package BinarySearch;
/*Given a sorted array of integers nums and an integer target, write a function to find the starting and ending position of target in the array.
If target is not present in the array, return [-1, -1].8*/

public class FirstAndLastOccurence {
    public static int[] firstAndLast(int arr[],int target){
        int first=-1;
        int last=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                if(first==-1){
                    first=i;
                    last=i;
                }
                last=i;
            }
        }

        return new int[]{first,last};
    }

    public static int lowerBound(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static int upperBound(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static int[] firstAndLast2(int arr[],int target){
        int lb=lowerBound(arr, target);
        if(lb==-1 || arr[lb]!=target){
            return new int[]{-1,-1};
        }
        int ub=upperBound(arr, target);
        if(ub==-1){
            ub=arr.length;
        }

        return new int[]{lb,ub-1};
    }

    public static int firstOccurence(int arr[],int target){
        int low=0;
        int high=arr.length;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    public static int lastOccurence(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    public static int[] firstAndLast3(int arr[],int target){
        int first=firstOccurence(arr, target);
        int last=lastOccurence(arr,target);
        return new int[]{first,last};
    }
    public static void main(String[] args) {
        int arr[]={2,4,8,8,8,8,11,13};

        int result[]=firstAndLast3(arr, 8);
        System.out.println("First Occurence:"+result[0]+" Last Occurence:"+result[1]);
    }
    
}
