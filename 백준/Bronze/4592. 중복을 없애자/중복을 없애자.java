import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		while(true) {
			
			StringTokenizer st= new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			if(n==0) {
				break;
			}
//			Set<Integer> s=new HashSet<>();
			int before=Integer.parseInt(st.nextToken());
			System.out.print(before+" ");
			for(int i=1; i<n; i++) {
				int k=Integer.parseInt(st.nextToken());
				if(k!=before) {
					System.out.print(k+" ");
				}
				before=k;
			}
			System.out.println("$");
			
		}
	}
}
