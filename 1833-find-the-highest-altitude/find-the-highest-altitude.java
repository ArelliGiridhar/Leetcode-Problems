class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int res=0;
        int x=0;
        for(int i=0;i<n;i++){
            x+=gain[i];
            res=Math.max(res,x);
        }
        return res;
    }
}

