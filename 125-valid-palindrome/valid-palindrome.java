class Solution {
    public boolean isAlphaNumericChar(char c){
        return (c>='a' && c<='z') ||
        (c>='A' && c<='Z') ||
        (c>='0' && c<='9');
    }
    public boolean isPalindrome(String s) {
        int i = 0 ;
        int j= s.length() -1 ;
        while(i<j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(! isAlphaNumericChar(c1)){
                i++;
                continue ;
            }
            if(! isAlphaNumericChar(c2)){
                j--;
                continue ;
            }
            if(Character.toLowerCase(c1)!= Character.toLowerCase(c2)){
                return false ;
            }
            i++;
            j--;

        }
        return true;
    }
}