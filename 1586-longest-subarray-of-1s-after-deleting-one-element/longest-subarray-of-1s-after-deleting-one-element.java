class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int zcnt=0;
        int curcnt=0;
        int maxlen=0;
        int right=0;
   while(right<nums.length){
            curcnt++;
            if(nums[right]==0){
                zcnt++;
            }
            while(zcnt>1){
                if(nums[left]==0){
                    zcnt--;
                }
                left++;
            }
            curcnt=right-left;
            right++;
          maxlen=Math.max(curcnt,maxlen);
        }
        return maxlen;
    }
}
        
