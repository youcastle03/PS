import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();

        String comp = "ABBDOPQRabdegopq@";
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < comp.length(); j++) {
                if (comp.charAt(j) == c) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}