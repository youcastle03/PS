import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[1000001];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }
        System.out.print(dp[n]);
    }
}