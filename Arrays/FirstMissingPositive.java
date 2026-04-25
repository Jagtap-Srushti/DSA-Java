package Arrays;


// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

public class FirstMissingPositive {

    public static int firstMisssingPositive(int arr[]) {

    int n = arr.length;

    // Step 1: Place each number at its correct index
    // Correct position of value x is index (x - 1)
    for (int i = 0; i < n; i++) {

        // Keep swapping until:
        // 1. Element is in range [1, n]
        // 2. Element is not already in correct position
        while (
            arr[i] > 0 &&          // ignore negative and zero
            arr[i] <= n &&         // ignore values greater than n
            arr[arr[i] - 1] != arr[i] // avoid infinite loop (duplicate case)
        ) {
            int temp = arr[i];

            // Swap arr[i] with its correct position
            arr[i] = arr[temp - 1];
            arr[temp - 1] = temp;
        }
    }

    // Step 2: Find the first index where value is incorrect
    // That index + 1 is the missing positive number
    for (int i = 0; i < n; i++) {
        if (arr[i] != i + 1) {
            return i + 1;
        }
    }

    // Step 3: If all positions are correct
    // Then missing number is n + 1
    return n + 1;
}

    public static void main(String[] args) {
        int arr[]={2, 3, 7, 6, 8, -1, -10, 15, 1};

        System.out.println(firstMisssingPositive(arr));
    }
    
}


/*
DRY RUN

Input:
arr = [2, 3, 7, 6, 8, -1, -10, 15, 1]
n = 9

We only care about values in range [1, n] => [1, 9]

--------------------------------------------------
STEP 1: Place elements at correct indices
(value x should be at index x-1)
--------------------------------------------------

i = 0:
[2, 3, 7, 6, 8, -1, -10, 15, 1]

arr[0] = 2 → correct index = 1 → swap(0,1)
[3, 2, 7, 6, 8, -1, -10, 15, 1]

arr[0] = 3 → index = 2 → swap(0,2)
[7, 2, 3, 6, 8, -1, -10, 15, 1]

arr[0] = 7 → index = 6 → swap(0,6)
[-10, 2, 3, 6, 8, -1, 7, 15, 1]

arr[0] = -10 → invalid → stop

--------------------------------------------------

i = 1:
arr[1] = 2 → already correct

--------------------------------------------------

i = 2:
arr[2] = 3 → already correct

--------------------------------------------------

i = 3:
arr[3] = 6 → index = 5 → swap(3,5)
[-10, 2, 3, -1, 8, 6, 7, 15, 1]

arr[3] = -1 → invalid → stop

--------------------------------------------------

i = 4:
arr[4] = 8 → index = 7 → swap(4,7)
[-10, 2, 3, -1, 15, 6, 7, 8, 1]

arr[4] = 15 → invalid → stop

--------------------------------------------------

i = 5:
arr[5] = 6 → already correct

--------------------------------------------------

i = 6:
arr[6] = 7 → already correct

--------------------------------------------------

i = 7:
arr[7] = 8 → already correct

--------------------------------------------------

i = 8:
arr[8] = 1 → index = 0 → swap(8,0)
[1, 2, 3, -1, 15, 6, 7, 8, -10]

arr[8] = -10 → invalid → stop

--------------------------------------------------
FINAL ARRAY AFTER PLACEMENT:
[1, 2, 3, -1, 15, 6, 7, 8, -10]

--------------------------------------------------
STEP 2: Find first missing positive
--------------------------------------------------

index 0 → 1 ✔
index 1 → 2 ✔
index 2 → 3 ✔
index 3 → expected 4, found -1 

👉 Answer = 4

--------------------------------------------------
FINAL OUTPUT: 4
--------------------------------------------------
*/
