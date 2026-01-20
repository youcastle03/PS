import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();

        String s2 = s;
        String t2 = t;
        int lcm = s.length() / gcd(s.length(), t.length()) * t.length();

        while(s2.length()<lcm){
            s2 += s;
        }
        while(t2.length()<lcm){
            t2 += t;
        }
        if(s2.equals(t2)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
