class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int n= triangle.length;
        int m= triangle[n-1].length;
        int[][] dp=new int[n][m];

        
        dp[0][0]=triangle[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if((i-1<0)){
                    continue;
                }
                if(j==0){
                    dp[i][j]=dp[i-1][j]+triangle[i][j];
                }
                else{
                    dp[i][j]+=Math.max(dp[i-1][j]+triangle[i][j],dp[i-1][j-1]+triangle[i][j]);
                }
            }
        }
        for(int i=0; i<m; i++){
            answer=Math.max(dp[m-1][i],answer);
        }
        return answer;
    }
}