import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		for(int c = 0; c<N; c++) {
			Stack<Character> st1 = new Stack<>();
			Stack<Character> st2 = new Stack<>();
			String typing = br.readLine();
			for(int i = 0; i<typing.length(); i++) {
				char key = typing.charAt(i);
			
				if(key == '<' && st1.size()>0 ) {
					st2.push(st1.pop());
				}
				else if(key == '>' && st2.size()>0) {
					st1.push(st2.pop());
				}
				else if(key == '-' && st1.size()>0) {
					st1.pop();
				}
				else if(key != '>' && key != '<' && key != '-') {
					st1.push(key);
				}
			}
			StringBuilder sb = new StringBuilder();
			
			int st1Size = st1.size();
			int st2Size = st2.size();
			for(int i = 0; i<st1Size; i++) {
				sb.append(st1.pop());
			}
			sb.reverse();
			
			for(int i = 0; i<st2Size; i++){
				sb.append(st2.pop());
			}
			System.out.println(sb.toString());
		}
	}

}
