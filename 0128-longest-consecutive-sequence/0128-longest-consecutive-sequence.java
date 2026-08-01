class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        if(n == 0) return 0;
        Arrays.sort(nums);
        
        int lastSmall = Integer.MIN_VALUE, count = 0, larg = 1;

        for(int i=0; i<n; i++){

           if(nums[i] - 1 == lastSmall){
            count++;
            lastSmall = nums[i];
           }else if(lastSmall != nums[i]){
            count = 1;
            lastSmall = nums[i];
           }
           larg = Math.max(count, larg);
        }
        return larg;
    }
}