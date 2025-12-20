class Solution {
    public int firstMissingPositive(int[] arr) {
    int n=arr.length;
        int ar1[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>0 && arr[i]<=n){
                int x=arr[i];
                ar1[x-1]=x;
            }
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(ar1[i]==0){
            res=i+1;
            break;
            }
        }
        if(res==0){
            return n+1;
        }
        else{
        return res;
        }
        
    }
}
