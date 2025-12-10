import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        int piv=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                piv=i;
                break;
            }
        }
            if(piv==-1){
                int low=0;
                int right=nums.length-1;
                while(low<right){
                    int tem=nums[low];
                    nums[low]=nums[right];
                    nums[right]=tem;
                    low++;
                    right--;
                }
             //return -1;
            }
            if(piv!=-1){
                for(int i=n-1;i>piv;i--){
                    if(nums[piv]<nums[i]){
                        int temp=nums[piv];
                        nums[piv]=nums[i];
                        nums[i]=temp;
                        break;
                    }
                }
                int arr1[]=Arrays.copyOfRange(nums,piv+1,n);
                Arrays.sort(arr1);
                for(int i=0;i<arr1.length;i++){
                    nums[piv+1+i]=arr1[i];
                }
            }
    }
}