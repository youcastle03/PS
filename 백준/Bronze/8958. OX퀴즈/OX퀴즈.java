
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n;
		int score=0;
		int total=0;
		n=sc.nextInt();
		String a[]=new String[n];

		for(int i=0; i<n; i++) {
			a[i]=sc.next();
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<a[i].length(); j++) {
				if(a[i].charAt(j)=='O') {
					score++;
					total+=score;

				}
				else {
					score=0;
				}
			}
			System.out.println(total);
			total=0;
			score=0;
		}

	}

}
