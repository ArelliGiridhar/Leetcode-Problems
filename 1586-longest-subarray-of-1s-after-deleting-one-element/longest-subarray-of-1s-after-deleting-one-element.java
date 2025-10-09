class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int zcnt=0;
        int curcnt=0;
        int maxlen=0;
        for(int right=0;right<nums.length;right++){
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
          maxlen=Math.max(curcnt,maxlen);
        }
        return maxlen;
    }
}
        
