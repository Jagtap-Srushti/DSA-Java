package Stack;

// Sum of Subarray Minimums

// Given an integer array arr, consider every contiguous, non-empty subarray. Find the minimum value in each subarray and return the sum of all such minimum values modulo 109 + 7.

import java.util.*;

public class SumOfSubarrayMinimum {

    // Find Previous Smaller Element (PSE) for every element
    public int[] findPSE(int arr[]) {

        int n = arr.length;

        // Stack stores indices, not values
        Stack<Integer> st = new Stack<>();

        int pse[] = new int[n];

        // Traverse from left to right
        for (int i = 0; i < n; i++) {

            // Remove elements greater than or equal to current element.
            // We need the nearest element strictly smaller than arr[i].
            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            // If stack is empty, there is no smaller element on the left
            if (st.empty()) {
                pse[i] = -1;
            } 
            else {
                // Top of stack is the nearest smaller element
                pse[i] = st.peek();
            }

            // Store current index for future elements
            st.push(i);
        }

        return pse;
    }


    // Find Next Smaller Element (NSE) for every element
    public int[] findNSE(int arr[]) {

        int n = arr.length;

        int nse[] = new int[n];

        // Stack stores indices
        Stack<Integer> st = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove elements strictly greater than current element.
            // Notice: here we use '>' instead of '>='.
            // This handles duplicate values correctly.
            while (!st.empty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            // If stack is empty, there is no smaller element on the right
            if (st.empty()) {
                nse[i] = n;
            } 
            else {
                // Top of stack is the nearest smaller element
                nse[i] = st.peek();
            }

            // Store current index for future elements
            st.push(i);
        }

        return nse;
    }


    public int sumSubarrayMins(int arr[]) {

        int n = arr.length;

        // Required modulo
        int mod = (int) (1e9 + 7);

        // Find previous and next smaller element indices
        int pse[] = findPSE(arr);
        int nse[] = findNSE(arr);

        long ans = 0;

        // Consider every element as the minimum
        for (int i = 0; i < n; i++) {

            // Number of possible starting positions
            int left = i - pse[i];

            // Number of possible ending positions
            int right = nse[i] - i;

            // Number of subarrays where arr[i] is the minimum
            // = left choices × right choices
            //
            // Multiply by arr[i] because arr[i] contributes
            // its value as the minimum to each such subarray.
            long contribution = (long) left * right * arr[i];

            // Add contribution to answer
            ans = (ans + contribution) % mod;
        }

        return (int) ans;
    }


    public static void main(String[] args) {

        SumOfSubarrayMinimum s1 = new SumOfSubarrayMinimum();

        int arr[] = {3, 1, 2, 4};

        System.out.println(s1.sumSubarrayMins(arr));
    }
}