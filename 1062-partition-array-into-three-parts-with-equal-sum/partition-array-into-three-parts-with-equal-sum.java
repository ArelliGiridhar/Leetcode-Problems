/* Steps for this problem 
1.First find the sum of the elements in the array 
2.Then then check if sum is divisible by 3 if no then return false else go far partion 
3.Then divide sum/3(why dividing 3? because in question it is given to make three parts).
4.take a for loop from starting index to end and sum the elemnets if the co equal to 
sum/3 then incrment the count and make co =0; and report the procedure upto n values.
5.At final if the count is greater than or equal to 3 then return true or return false.
*/
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int count=0;
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%3!=0){
            return false;
        }
        sum/=3;
        int co=0;
        for(int i=0;i<n;i++){
            co+=arr[i];
            if(co==sum){
                count++;
                co=0;
            }
        }
        if(count>=3){
            return true;
        }
        return false;
    }
}
        