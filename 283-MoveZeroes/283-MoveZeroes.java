// Last updated: 14/07/2026, 14:00:10
class Solution {
    public void moveZeroes(int[] nums) {
        int[] result = new int[nums.length];
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                result[k] = nums[i];
                k++;
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = result[i];
        }
    }
}