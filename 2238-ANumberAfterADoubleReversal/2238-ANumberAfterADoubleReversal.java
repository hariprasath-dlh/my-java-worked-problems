// Last updated: 14/07/2026, 13:59:30
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        return !(num%10==0);
    }
}