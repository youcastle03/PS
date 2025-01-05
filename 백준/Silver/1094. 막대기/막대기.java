import java.util.*;
public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=64;
		int count=0;
		int x=sc.nextInt();
		while(x>0) {
			if(n>x) {
				n/=2;
			}
			else {
				count++;
				x-=n;
			}
		}
		System.out.println(count);
	}

}
