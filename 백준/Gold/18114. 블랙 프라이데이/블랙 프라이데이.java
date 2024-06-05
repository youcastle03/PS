import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());		// 물건의 개수
		int C = Integer.parseInt(st.nextToken());		// 무게

		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> w = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			w.add(Integer.parseInt(st.nextToken()));
			// 1개 선택
			if(w.get(i) == C) {
				System.out.println(1);
				return;
			}
		}
		
		Collections.sort(w);
		int left = 0;
		int right = N-1;
		int weight;
		while(left < right) {
			weight = w.get(left) + w.get(right);
			if(weight > C) {
				right--;
			}
			else if(weight == C) {
				System.out.println(1);
				return;
			}
			else {
				if(w.indexOf(C-weight) < right && w.indexOf(C-weight) > left){
					System.out.println(1);
					return;
				}
				left++;
			}
		}
		System.out.println(0);
	}	
}

