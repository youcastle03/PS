import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class Main {
	static int n, k;
    static int[] a;
    static int[] visit;
    static int count=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        a = new int[n];
        visit = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        back(500, 0);
        System.out.println(count);
    }

    static void back(int sum, int index) {
        if (index == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visit[i]==0 && (sum + a[i] - k) >= 500) {
                visit[i] = 1;
                back(sum + a[i] - k, index + 1);
                visit[i] = 0;
            }
        }
    }
	
}