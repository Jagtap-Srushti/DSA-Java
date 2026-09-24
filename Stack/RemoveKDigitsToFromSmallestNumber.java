package Stack;

import java.util.*;

public class RemoveKDigitsToFromSmallestNumber {

    public static String removeKDigitToFormSmallerElement(String num, int k) {

        // Monotonic increasing stack:
        // We remove a larger previous digit when the current digit is smaller.
        Stack<Character> st = new Stack<>();

        for (char digit : num.toCharArray()) {

            // If the previous digit is greater than the current digit,
            // removing the previous digit helps us form a smaller number.
            // Continue until the stack becomes increasing or k becomes 0.
            while (!st.empty() && k > 0 &&
                   st.peek() - '0' > digit - '0') {

                st.pop();
                k--;
            }

            // Add the current digit to the stack.
            st.push(digit);
        }

        // If k digits are still left to remove,
        // remove them from the end because the remaining number
        // is already in increasing order.
        while (k > 0) {
            st.pop();
            k--;
        }

        // Build the answer from the stack.
        // Since we pop from the stack, the digits initially come in reverse order.
        StringBuilder sb = new StringBuilder();

        while (!st.empty()) {
            sb.append(st.pop());
        }

        // Restore the original left-to-right order.
        sb.reverse();

        // Remove leading zeros.
        // Example: "00123" -> "123"
        int i = 0;

        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }

        String result = sb.substring(i);

        // If all digits were removed or only zeros remained,
        // return "0" instead of an empty string.
        return result.isEmpty() ? "0" : result;
    }

    public static void main(String[] args) {

        String num = "1432219";
        int k = 3;

        System.out.println(removeKDigitToFormSmallerElement(num, k));
    }
}

