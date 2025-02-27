import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t,n,m;
		double numM=1;
		double numN=1;
		double num;
		t=sc.nextInt();
		for(int i=0; i<t; i++) {
			n=sc.nextInt();
			m=sc.nextInt();
			for(double j=0; j<n; j++) {
				numM*=m;
				m--;
			}
			
			for(double j=n; j>0; j--) {
				numN*=j;
			}
			num=numM/numN;
			System.out.printf("%.0f\n", num);
			numM=1;
			numN=1;
			
		}
		
	}
}
