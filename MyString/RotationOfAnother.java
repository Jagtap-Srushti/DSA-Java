package MyString;
public class RotationOfAnother {

    public static boolean rotateString(String s,String goal){
        if(s.length()!=goal.length()){
            return false;
        }

        String doubleS=s+s;

        return doubleS.contains(goal);
    }
    public static void main(String[] args) {
        String s="rotation";
        String goal="tionrota";

        System.out.println(rotateString(s, goal));

    }
    
}
