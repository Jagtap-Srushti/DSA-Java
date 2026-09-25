package Stack;

import java.util.*;;

public class MinStack {

    Stack<Integer> st;
    int min;

    public MinStack() {
        st = new Stack<>();
        min = Integer.MIN_VALUE;
    }

    public void insert(int value) {
        /*
         * IDEA:
         * We need push(), pop(), top() and getMin() in O(1).
         *
         * Instead of using a second stack to store minimums,
         * we maintain the current minimum in the variable 'min'.
         *
         * If the new value is >= min:
         * Store it normally.
         *
         * If the new value is < min:
         * It becomes the new minimum.
         * Before changing min, store an ENCODED value:
         *
         * encoded = 2 * value - min
         *
         * Then update:
         *
         * min = value
         *
         * Why encode?
         * The encoded value will always be smaller than the new min.
         * Therefore, later we can recognize it as a special marker
         * and recover the previous minimum.
         */

        if (st.empty()) {
            st.push(value);
            min = value;
        } else {
            if (value > min) { // Normal value: no change to minimum
                st.push(value);
            } else {

                // Value becomes the new minimum.
                // Store encoded value instead of the actual value.
                st.push(2 * value - min);
                min = value;
            }
        }
    }

    public void pop() {

        if (st.empty()) {
            return;
        } else {
            int n = st.peek();
            st.pop();

        /*
         * If n >= min:
         * It was a normal value, so min does not change.
         *
         * If n < min:
         * n is an encoded value.
         * This means the current min was created when
         * this encoded value was pushed.
         *
         * Recover the PREVIOUS minimum:
         *
         * encoded = 2 * currentMin - previousMin
         *
         * Therefore:
         *
         * previousMin = 2 * currentMin - encoded
         */

            if (n < min) {
                min = 2 * min - n;
            }
        }

    }

    public int top() {
        if (st.isEmpty()) {
            return -1;
        }
        int n = st.peek();

        /*
         * If n >= min:
         *     n is the actual top value.
         *
         * If n < min:
         *     n is an encoded value.
         *     The actual top value is the current minimum.
         */

        if (n < min) {
            return min;
        } else {
            return n;
        }
    }

    public int getMin() {
        // Current minimum is always stored in 'min'.
        return min;
    }

    public static void main(String[] args) {
        MinStack s1 = new MinStack();
        s1.insert(12);
        s1.insert(15);
        s1.insert(10);
        System.out.println(s1.getMin());
        s1.pop();
        System.out.println(s1.getMin());

    }

}
