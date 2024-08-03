import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int N = Integer.valueOf(br.readLine());

        long result = combination(N, 5);
        System.out.println(result);
       
	}
	public static Long combination(int n, int r) {
		if(n == r || r == 0) {
			return 1L;
		}
	 
		return combination(n - 1, r - 1) + combination(n - 1, r); 
	}

}