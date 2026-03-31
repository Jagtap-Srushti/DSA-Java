package MyString;

// The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.

// For example, the beauty of "abaacc" is 3 - 1 = 2.
// Given a string s, return the sum of beauty of all of its substrings.

 
public class SumOfBeautyOfAllSubstring {
    public static int beautySum(String s){
        int n=s.length();
        int total=0;

        for(int i=0;i<n;i++){

            int freq[]=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;

                int min=Integer.MAX_VALUE;
                int max=0;

                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        max=Math.max(max,freq[k]);
                        min=Math.min(min,freq[k]);
                    }
                }

                total+=(max-min);
            }
        }

        return total;
    }
    public static void main(String[] args) {
        String s = "aabcbaa";
        System.out.println(beautySum(s));
    }
    
}
