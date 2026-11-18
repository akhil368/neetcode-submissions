class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] arr=new char[26];
        for(char c:s.toCharArray()) {
            arr[c-'a']++;
        }
         for(char c:t.toCharArray()) {
            arr[c-'a']--;
        }
        for(char c:arr) {
            if(c!=0) 
                return false;
        }
        return true;

    }
}
