import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        System.out.println(countValue(N));
    }
    static int countValue(int N) {
        int count = 0;
        int num = 666;
        while(count<N) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }
            num += 1;

        }
        num = num - 1;
        return num;
    }
}