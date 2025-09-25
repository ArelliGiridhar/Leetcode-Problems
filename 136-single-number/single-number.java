class Solution {
    public int singleNumber(int[] nums) {
        Map <Integer,Integer>abc=new HashMap<>();
        int count=0;
        for(int i:nums){
            abc.put(i,abc.getOrDefault(i,0)+1);
        }
        for(int a:abc.keySet()){
            if(abc.get(a)==1){
                return a;
            }
        }
        return 0;
    }
}