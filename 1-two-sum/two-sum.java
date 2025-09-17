class Solution {
    public int[] twoSum(int[] nums, int target) {
   Map<Integer , Integer >dict=new HashMap<>();
   int n=nums.length;
   for(int i=0;i<n;i++){
    int t=target-nums[i];
    if(dict.containsKey(t)){
        int [] res=new int[]{i,dict.get(t)};
        return res;
    }
    else {
        dict.put(nums[i],i);
    }
   }
   return null;
    }
}