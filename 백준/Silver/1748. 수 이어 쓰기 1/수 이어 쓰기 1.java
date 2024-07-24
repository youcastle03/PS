import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int sum = 0;
		int length = 1;
		int digit = 10;
		for(int i=1; i<=N; i++) {
			if(i%digit == 0) {
				length++;
				digit *= 10;
			}
			sum += length;
		}
		System.out.println(sum);
	
	}

}