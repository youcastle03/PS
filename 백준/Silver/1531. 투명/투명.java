import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int x1,x2,y1,y2;
		int count=0;
		int pic[][]=new int[101][101];
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			x1=sc.nextInt();
			y1=sc.nextInt();
			x2=sc.nextInt();
			y2=sc.nextInt();
			for(int j=x1; j<=x2; j++) {
				for(int k=y1; k<=y2; k++) {
					pic[j][k]++;
				}
 			}
		}
		for(int i=0; i<=100; i++) {
			for(int j=0; j<=100; j++) {
				if(pic[i][j]>m) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}	
