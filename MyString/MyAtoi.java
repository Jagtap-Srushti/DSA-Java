package MyString;

public class MyAtoi {
    final int MAX_VAL=Integer.MAX_VALUE;
    final int MIN_VAL=Integer.MIN_VALUE;

    public int helper(String s,int i,long num,int sign){
        if(i>=s.length() || !Character.isDigit(s.charAt(i))){
            return (int)(sign*num);
        }

        num=num*10+(s.charAt(i)-'0');

        if(sign*num>MAX_VAL){
            return MAX_VAL;
        }

        if(sign*num<MIN_VAL){
            return MIN_VAL;
        }

        return helper(s,i+1,num,sign);


    }
    
    public int myAtoi(String s){
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }

        int sign=1;
        if(i<s.length() && s.charAt(i)=='-' || s.charAt(i)=='+'){
            sign=s.charAt(i)=='-'?-1:1;
            i++;
        }
        return helper(s,i,0,sign);
    }
    public static void main(String[] args) {

        MyAtoi a=new MyAtoi();
         String s = "   -12345Hello";
        System.out.println(a.myAtoi(s));
        
    }
    
}
