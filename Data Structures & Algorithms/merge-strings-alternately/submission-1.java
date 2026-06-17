class Solution {
    public String mergeAlternately(String word1, String word2) {
       char[] str=new char[word1.length()+word2.length()];

        int i=0;
        int j=0;
        int k=0;

        while(i<word1.length() || j<word2.length()) {
            if(i<word1.length()){
                str[k]=word1.charAt(i);
                i++;
                k++;
            }
            if(j<word2.length()) {
                str[k]=word2.charAt(j);
                j++;
                k++;
            }
        }
        String s=new String(str);
        return s;
    }
}