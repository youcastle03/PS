import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static long[] dot;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        dot = new long[n];
        s = br.readLine();
        st = new StringTokenizer(s, " ");

        for (int i = 0; i < n; i++) {
            dot[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(dot);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            int result = binarySearch(n,m);
            sb.append(result).append('\n');
        }

        System.out.println(sb.toString().trim());
    }

    static int binarySearch(int x, int y) {
        int left = 0;
        int right = dot.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (dot[mid] < x) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }    
        int startIndex = left;
      
        left = 0;
        right = dot.length - 1;

        
        
        while (left <= right) {
            int mid = (left + right) / 2;

            if (dot[mid] > y) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        int endIndex = right + 1;


        return endIndex - startIndex;
    }
}