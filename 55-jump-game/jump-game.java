class Solution {
    public boolean canJump(int[] nums) {

        int last_post=nums.length-1;
        for(int i=nums.length-2 ;i>=0 ;i--){
            if(i+nums[i]>=last_post){
                last_post=i;
            }
        }
        return last_post==0;
        
    }
}