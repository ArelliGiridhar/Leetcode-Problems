class Solution {
    public int longestOnes(int[] arr, int k) {
        int start=0;
        int end=0;
        int cnt=0;
        int res=0;
        int n=arr.length;
        while(end<n){
        if(arr[end]==0){
            cnt++;
        }
        while(cnt>k){
            if(arr[start]==0){
                cnt--;
            }
            start++;
        }
        res=Math.max(res,(end-start+1));
        end++;
        }
        return res;
    }
}

     