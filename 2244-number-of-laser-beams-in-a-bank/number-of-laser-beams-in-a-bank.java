class Solution {
    public int numberOfBeams(String[] bank) {
        int res=0;
        int prev=0;
        for(String row :bank){
            int curcnt=0;
            for(char ch: row.toCharArray()){
                if(ch=='1'){
                    curcnt+=1;
                }
            }
            if(curcnt>0){
                res+=prev*curcnt;
                prev=curcnt;
            }
        }
        return res;
    }
}
           