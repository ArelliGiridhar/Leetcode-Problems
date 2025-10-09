class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        int left=0;
        //i right=k-1;nt
        int curcount=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                curcount++;
            }
        }
        min=curcount;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(left)=='W'){
                curcount--;
            }
            if(blocks.charAt(i)=='W'){
            curcount++;
            }
            min=Math.min(curcount,min);
            left++;
        }
        return min;
    }
}