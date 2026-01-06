class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int peak=0;
        /*for( int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1]&& nums[i]>nums[i+1]){
                peak=i;
                break;
            }
        }*/
        if(n>=2){
        if(nums[n-1]>nums[n-2] && peak==0 ){
            return n-1;
        }
            
        }
        int low=1;
        int high=n-2;
        int count=0;
        while(low<=high && low>0 && high<n-1 && count==0){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                peak=mid;
                count++;
            }
            else if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return peak;
    }
}