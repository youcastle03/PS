import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		int a,b;
		for(int i=0; i<n; i++) {
			st= new StringTokenizer(br.readLine()," ");
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			int data=1;
			for(int j=0; j<b; j++) {
				data=(a*data)%10;
			}
			if(data==0) {
				data=10;
			}
			sb.append(data).append('\n');
			
		}
		System.out.println(sb);
		br.close();
		
	}
}	