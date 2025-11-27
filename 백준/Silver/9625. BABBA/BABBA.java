import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] dp=new int[2][n+1];
        dp[0][1]=0;
        dp[1][1]=1;
        if(n>=2) {
            dp[0][2] = 1;
            dp[1][2] = 1;
        }



        for(int i=3; i<=n; i++) {
            dp[0][i]=dp[0][i-1]+dp[0][i-2];
            dp[1][i]=dp[1][i-1]+dp[1][i-2];
        }

        System.out.println(dp[0][n]+" "+dp[1][n]);
    }

}