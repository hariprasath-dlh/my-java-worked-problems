// Last updated: 14/07/2026, 14:00:22
class Solution {
    public int trailingZeroes(int n) {
        int sum =0;
        while(n>=5){
            sum = sum+(n/5);
            n=n/5;
        }
        return sum;
    }
}