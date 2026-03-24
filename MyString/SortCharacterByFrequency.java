package MyString;

public class SortCharacterByFrequency {
    public static String sortByFrequency(String s){
        int freq[]=new int[256]; // Array to store frequency of each character alphabet ,symbol etc.

        //count frequency
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            int max=0;
            char maxEle=0;
             // Find character with highest frequency
            for(int j=0;j<255;j++){
                if(freq[j]>max){
                    max=freq[j];
                    maxEle=(char)j;
                }
            }
            //character to stringbuilder and set frequency to 0
            while(max>0){
                sb.append(maxEle);
                max--;
            }
            freq[maxEle]=0;

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="tree";
        System.out.println(sortByFrequency(s));
        
    }
    
}
