import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
 
		for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
			Integer[] arr = new Integer[10];
			for(int j=0; j<10; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr, Collections.reverseOrder());
			System.out.println(arr[2]);
		}
	}

}