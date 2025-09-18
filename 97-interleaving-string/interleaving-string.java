class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n=s1.length();
        int m=s2.length();
        if((n+m)!=s3.length()){
            return false;
        }
        int dp[][]=new int [m+1][n+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            if(s1.charAt(i-1)==s3.charAt(i-1) && dp[0][i-1]==1){
                dp[0][i]=1;
            }
        }
        for(int i=1;i<=m;i++){
            if(s2.charAt(i-1)==s3.charAt(i-1) && dp[i-1][0]==1){
                dp[i][0]=1;
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(dp[i-1][j]==1 || dp[i][j-1]==1){
                    if(dp[i][j-1]==1 && s1.charAt(j-1)==s3.charAt(i+j-1)){
                        dp[i][j]=1;
                        }
                     if(dp[i-1][j]==1 && s2.charAt(i-1)==s3.charAt(i+j-1)){
                        dp[i][j]=1;
                        }
                }
                else{
                    if(dp[i][j-1]==1){
                        if(s1.charAt(j-1)==s3.charAt(i+j-1)){
                            dp[i][j]=1;
                        }
                    }
                    if(dp[i-1][j]==1){
                        if(s2.charAt(i-1)==s3.charAt(i+j-1)){
                            dp[i][j]=1;
                        }
                    }
                }
            }
        }
        if(dp[m][n]==1){
            return true;
        }
        else {
            return false;
        }
    }
}
            