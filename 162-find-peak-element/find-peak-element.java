class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int peak=0;
        for( int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1]&& nums[i]>nums[i+1]){
                peak=i;
                break;
            }
        }
        if(n>=2){
        if(nums[n-1]>nums[n-2] && peak==0 ){
            peak=nums.length-1;
        }
            
        }
        return peak;
    }
}