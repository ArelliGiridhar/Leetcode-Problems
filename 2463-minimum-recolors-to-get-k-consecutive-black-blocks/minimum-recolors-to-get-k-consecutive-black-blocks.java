class Solution {
    public int minimumRecolors(String blocks, int k) {
       // int min=Integer.MAX_VALUE;//intialize the minimum one with the maximum value why because we are finding the minmum no of moves
        int left=0;
        //i right=k-1;nt
        int curcount=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                curcount++;
            }
        }
        int min=curcount;
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
//intialize the first for loop from i=0 to i=k then count the no of whites in it , then intialize the next for loop from i=k to i=string length. if the i value is white increment the count value, if the left(starting index) value is white then decrement the count value update the min value in each iterations;