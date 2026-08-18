class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        int i = 0;
        while(i<n-1){

            for(int j=i+1; j<n; j++){
                if(nums[i]+nums[j]==target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
            i++;
        }
        return ans;
    }
}