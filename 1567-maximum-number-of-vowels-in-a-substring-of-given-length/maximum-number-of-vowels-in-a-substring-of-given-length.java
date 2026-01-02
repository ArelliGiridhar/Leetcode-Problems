class Solution {
    public int maxVowels(String s, int k) {
        int res=0;
        int left=0;
        int right=k-1;
        int n=s.length();
        String vowels="aeiou";
        int count=0;
        for(int i=0;i<k;i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                count++;
            }
        }
        res=count;
        for(int i=k;i<n;i++){
            if(vowels.indexOf(s.charAt(i))!=-1)
            count++;
            if(vowels.indexOf(s.charAt(i-k))!=-1)
            count--;
            res=Math.max(res,count);
        }
        return res;
    }
}
