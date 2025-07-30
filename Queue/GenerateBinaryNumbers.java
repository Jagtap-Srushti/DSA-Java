package Queue;
import java.util.*;

public class GenerateBinaryNumbers {
    public static void generateBinary(int n){
        Queue<String> q=new LinkedList<>();
        q.add("1");
        for(int i=0;i<n;i++){
            String binary=q.remove();
            System.out.print(binary+" ");
            q.add(binary+"0");
            q.add(binary+"1");
        }

    }
    public static void main(String[] args) {
        int n=5;
        generateBinary(n);
        
    }
    
}
