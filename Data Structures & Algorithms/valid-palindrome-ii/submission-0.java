class Solution {
    public boolean validPalindrome(String s) {
       
	        int i=0,j=s.length()-1;
	        while(i<j ) {
	        	 if(s.charAt(i)!=s.charAt(j) ) {
                    return isPal(i,j-1,s) || isPal(i+1,j,s);
	            	
	            } else {
	            	i++;
	            	j--;
                }
	            	
	            }
			return true;
        
    }
private boolean isPal(int i,int j,String str) {
    while(i<j) {
        if(str.charAt(i)!=str.charAt(j)) {
            return false;
        } 
        i++;
        j--;
    }
    return true;
}
}