// Last updated: 14/07/2026, 13:59:51
class Solution {
    public boolean hasAlternatingBits(int n) {
        int a=n^(n>>1);
        return (a&(a+1))==0;
    }
}