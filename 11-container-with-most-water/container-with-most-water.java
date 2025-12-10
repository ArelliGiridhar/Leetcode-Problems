class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int result=0;
        while(left<right){
            result=Math.max(Math.min(height[left],height[right])*(right-left),result);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
}


   