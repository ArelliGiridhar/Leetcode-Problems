class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int l1=0;
        int l2=0;
        int r1=0;
        int r2=0;
        int low=0;
        int n=nums1.length;
        int m=nums2.length;
       int high=n;
        while(low<=high){
            int mid1=(low+high)/2;
            int mid2=(((n+m+1)/2)-mid1);
            if(mid1==0){
                l1=Integer.MIN_VALUE;
                
            }
            else{
                l1=nums1[mid1-1];
            }
             if(mid1>=n ){
                r1=Integer.MAX_VALUE;
             }
             else{
                r1=nums1[mid1];
             }
             if(mid2==0){
                l2=Integer.MIN_VALUE;
            }
            else{
                l2=nums2[mid2-1];
            }
            if(mid2>=m){
                r2=Integer.MAX_VALUE;
            }
            else{
                r2=nums2[mid2];
            }
            if(l1<=r2 && l2<=r1){
                if((n+m)%2!=0){
                    return Math.max(l1,l2);
                }
                else{
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
            }
            if( l2>r1 ){
                low=mid1+1;
            }
            else{
                high=mid1-1;
            }
        }
        return 0.0;
    }
}