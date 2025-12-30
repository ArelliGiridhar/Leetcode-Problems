class Solution {
    public String intToRoman(int num) {
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String rom[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String sb="";
        int n=values.length;
        for(int i=0;i<n;i++){
            while(num>=values[i]){
                sb+=rom[i];
                num-=values[i];
            }
            if(num==0){
                i=n;
            }
        }
        return sb;
    }
}
