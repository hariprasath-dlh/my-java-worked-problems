// Last updated: 14/07/2026, 13:59:22
class Solution {
    public int numberOfCuts(int n) {
        if(n%2==0){
            return n/2;
        }
        else if(n==1){
            return 0;
        }
        else{
            return n;
        }
    }
}