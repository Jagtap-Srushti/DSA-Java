package MyString;

public class StringCompression {
    public static int stringCompression(char chars[]){
        int n=chars.length;
        int j=0;
        for(int i=0;i<n;i++){
            int count=1;
            while(i<n-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }

            chars[j]=chars[i];
            j++;
            if(count>1){
                String cnt=Integer.toString(count);
                for(int k=0;k<cnt.length();k++){
                    chars[j]=cnt.charAt(k);
                    j++;
                }
            }
        }
        return j;
    }
    public static void main(String[] args) {
        char chars[]={'a','a','b','b','b','b','b','b','b','b','b','b','b','b'};  //['a','2','b','1','2']

        System.out.println(stringCompression(chars));
        
    }
    
}
