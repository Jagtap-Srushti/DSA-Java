package MyString;

public class LongestPalindromicSubstring {

    public boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

      public String longestPalindromeOptimal(String s){
        int n=s.length();
        String ans="";

        for(int i=0;i<n;i++){
            String p1=expand(s,i,i);
            String p2=expand(s,i,i+1);

            if(p1.length()>ans.length()){
                ans=p1;
            }

            if(p2.length()>ans.length()){
                ans=p2;
            }
        }

        return ans;
    }

    public String expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }

        return s.substring(left+1, right);
    }



    public String longestPalindromeBrute(String s){
        int n=s.length();
        String ans="";

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    if(j-i+1>ans.length()){
                        ans=s.substring(i, j+1);
                    }
                }
            }
        }
        return ans;
    }


      public static void main(String[] args) {

        String s="babad";

        LongestPalindromicSubstring l1=new LongestPalindromicSubstring();
        System.out.println(l1.longestPalindromeOptimal(s));
        
    }    
}
