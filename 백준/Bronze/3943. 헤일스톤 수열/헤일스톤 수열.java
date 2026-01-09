import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int max = n;
            while(n!=1){
               if(n%2==0){
                   n/=2;
               }
               else{
                   n*=3;
                   n+=1;
               }
               if(max<n){
                   max = n;
               }
            }
            System.out.println(max);
        }

    }
}
