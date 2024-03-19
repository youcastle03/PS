import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		long a=Long.parseLong(st.nextToken());
		long b= Long.parseLong(st.nextToken());
		long count=0;
		while(true) {
			if(a==b) {
				count++;
				break;
			}
			if((b%10==3)||(b%10==5)||(b%10==7)||(b%10==9)||(b<a)) {
				count=-1;
				break;
			}
			if((b%10)==1) {
				b/=10;
				count++;
			}
			else {
				b/=2;
				count++;
			}
			
		}
		System.out.println(count);
	}
}