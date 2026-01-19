import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		int[] x = new int[n+1]; 	
		x[0] = 0;
		x[1] = 0;	
		for(int i = 2; i <= n; i++) {
			x[i] = x[i-1] + 1; 
			
			if(i % 2 == 0) {
				x[i] = Math.min(x[i], x[i/2]+1); 
			}
			if(i % 3 == 0) {
				x[i] = Math.min(x[i], x[i/3]+1);
			}
		}
		System.out.println(x[n]);
		sc.close();
	}
}
