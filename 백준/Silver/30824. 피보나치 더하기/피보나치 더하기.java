import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long[] f = new long[79];
        f[0] = 0; 
        f[1] = 1;
        for (int i = 2; i <= 78; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        int t = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long k = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            
            boolean found = false;
            if (k == 1) {
                for (int j = 1; j <= 78; j++) {
                    if (f[j] == x) {
                        found = true;
                        break;
                    }
                }
            } 
            else if (k == 2) {
                for (int j = 1; j <= 78; j++) {
                    for (int m = 1; m <= 78; m++) {
                        if (f[j] + f[m] == x) {
                            found = true;
                            break;
                        }
                    }
                }
            } 
            else {
                for (int j = 1; j <= 78; j++) {
                    for (int m = 1; m <= 78; m++) {
                        for (int n = 1; n <= 78; n++) {
                            if (f[j] + f[m] + f[n] == x) {
                                found = true;
                                break;
                            }
                        }
                    }
                }
            }
            
            result.append(found ? "YES" : "NO").append("\n");
        }
        
        System.out.print(result);
    }


}