class Solution{
    public long diff(int i, int n, long pre[], long dp[]){
        if(i==n - 1){
            return pre[i + 1];
        }
        if(dp[i] != - 1){
            return dp[i];
        }
        long next = diff(i + 1, n, pre, dp);
         return dp[i] = Math.max(next, pre[i + 1] - next);
    }
    public int stoneGameVIII(int[] srr){
        int n = srr.length;

        long pre[] = new long[n+1];
        for(int i = 0; i < n; i++){
            pre[i+1] = pre[i]+srr[i];
        }
        long dp[] = new long[n  + 1];
        for(int i = 0; i <= n; i++){
            dp[i] = -1;
        }
        return (int)diff(1, n, pre, dp);
    }
}