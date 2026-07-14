// Last updated: 14/07/2026, 14:00:34
class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int left =0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}