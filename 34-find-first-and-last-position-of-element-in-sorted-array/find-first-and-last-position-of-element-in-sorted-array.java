class Solution {
    public int[] searchRange(int[] arr, int target) {
        int first=-1;
        int second=-1;
        /*for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if (first==-1){
                    first=i;
                }
                else{
                    second=i;
                    i=nums.length;
                }

            }
        }
        int arr[]={first,second};
        return arr;*/
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                second=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
       // if(first==second){
          //  second=-1;
       // }
        int arrr[]={first,second};
        return arrr;
    }
}
  