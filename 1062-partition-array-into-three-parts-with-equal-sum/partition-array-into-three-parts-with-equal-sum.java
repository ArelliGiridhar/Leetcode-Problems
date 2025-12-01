class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int count=0;
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%3!=0){
            return false;
        }
        sum/=3;
        int co=0;
        for(int i=0;i<n;i++){
            co+=arr[i];
            if(co==sum){
                count++;
                co=0;
            }
        }
        if(count>=3){
            return true;
        }
        return false;
    }
}
        