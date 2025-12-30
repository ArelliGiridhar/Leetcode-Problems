class Solution {
    public int romanToInt(String s) {
        int res=0;
        Map<Character,Integer> a=Map.of(
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000
        );
        int n=s.length();
        for(int i=0;i<n;i++){
            char b=s.charAt(i);
            if(i+1<n){
                char c=s.charAt(i+1);
            if(a.get(c)>a.get(b)){
                res+=a.get(c)-a.get(b);
                i++;
            }
            else{
            res+=a.get(b);
            }
            }
            else{
                res+=a.get(b);
            }
        }
        return res;
    }
}
