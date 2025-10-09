class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int cnt=0;
        for(int num: nums){
            set.add(num);
        }
        int unique=set.size();
        Map <Integer,Integer> dict=new HashMap<>();
        int left=0;
        for(int right=0;right<nums.length;right++){
            int a=nums[right];
            dict.put(a,dict.getOrDefault(a,0)+1);
            while(dict.size()==unique){
                cnt+=nums.length-right;
                int b=nums[left];
                dict.put(b,dict.get(b)-1);
                if(dict.get(b)==0){
                    dict.remove(b);
                }
                left++;
            }
        }
        return cnt;
    }
}