import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean stop = false;
        int count = 0;
        int answer = 0;

        boolean[] isPrime = new boolean[N + 1];
        for(int i = 2; i <= N; i++){
            isPrime[i] = true; 
        }

        for(int i = 2; i <= N; i++){
            if(!isPrime[i]) {
                continue;
            }

            
            for(int j = i; j <= N; j += i){
                if(!isPrime[j]) {
                    continue;
                }
                isPrime[j] = false;
                count++;
                if(count == K){
                    answer = j;
                    stop = true;
                    break;
                }
            }
            if(stop){
                break;
            }
        }

        System.out.println(answer);
    }
}