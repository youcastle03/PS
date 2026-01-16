import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	
		int p1=0, p2=0; 
		int sum=0, count=0; 
		while(p1<=N) {
			while(++p2<=N) { 
				sum += p2;               
				if(sum>=N) {
					if(sum==N){
                        count++;
                    }
					break;
				}
			}
			while(++p1<=N) { 
				sum -= p1; 
				if(sum<=N) {
					if(sum==N) {
                        count++;
                    }
					break;
				}    
			}	
		}
		System.out.println(count);
	}
}