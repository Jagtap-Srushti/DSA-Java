package MyString;
public class RemoveOuterParentheses {
    public static String removeOuterParenthesis(String s){
        StringBuilder sb=new StringBuilder();
        int depth=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(depth>0){
                    sb.append(ch);
                }
                depth++;
            }
            else{
                depth--;
                if(depth>0){
                    sb.append(ch);
                }
            }
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        String s="((()))(())";

        System.out.println(removeOuterParenthesis(s));
    }
}
