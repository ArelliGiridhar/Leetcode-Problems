class Solution {
    public char findTheDifference(String s, String t) {
        int res=0;
        String comb=s+t;
        for(int i=0;i<comb.length();i++){
            res=res^comb.charAt(i);
        }
        return (char) res;
    }
}