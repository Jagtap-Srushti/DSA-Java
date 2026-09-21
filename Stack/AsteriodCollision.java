package Stack;

// An integer array asteroids is given. Each value represents one asteroid in a row. The absolute value represents size, a positive value means movement toward the right, and a negative value means movement toward the left.

// All asteroids move at the same speed. When two asteroids meet, the smaller asteroid explodes, and the larger asteroid keeps moving in the same direction. When sizes are equal, both asteroids explode. Asteroids moving in the same direction never meet. Return the final state after all collisions.
import java.util.*;

public class AsteriodCollision {
    public static int[] asteroidCollision(int astroids[]){
        Stack<Integer> st=new Stack<>();

        for(int asteroid:astroids){
            boolean isAlive=true;

             // Collision is possible only when a positive asteroid
            // is moving right and a negative asteroid is moving left.
            while(!st.empty() && st.peek()>0 && asteroid<0){

                 // Current negative asteroid is larger,
                // so the stack asteroid gets destroyed.
                // Current asteroid may collide again with the next asteroid.
                if(st.peek()< -asteroid){
                    st.pop();
                }

                // Both asteroids have the same size, so both are destroyed.
                else if(st.peek()== -asteroid){
                    st.pop();
                    isAlive=false;
                    break;
                }

                // Stack asteroid is larger, so the current asteroid is destroyed.
                else{
                    isAlive=false;
                    break;
                }
            }

            // Push the current asteroid only if it survived all collisions.
            if(isAlive){
                st.push(asteroid);
            }
        }

        int ans[]=new int[st.size()];

        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }

        return ans;


    }
   public static void main(String[] args) {
    int asteroids[]={ 4,7,1,1,2,-3,-7,17,15,-16};
    int result[]=asteroidCollision(asteroids);
    for(int i=0;i<result.length;i++){
        System.out.print(result[i]+" ");
    }

   }
    
}
