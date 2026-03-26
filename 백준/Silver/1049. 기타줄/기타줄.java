import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int n,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();

		int[] pack=new int[m];
		int[] sol=new int[m];
		int min=Integer.MAX_VALUE; 
		for(int i=0;i<m;i++) {
			pack[i]=sc.nextInt();
			sol[i]=sc.nextInt();
			min=Math.min(min, Math.min(pack[i], sol[i]*6));
		}

		int answer=Integer.MAX_VALUE;
		for(int i=0;i<m;i++) {
			answer=Math.min(answer,sol[i]*(n%6));
		}
		answer+=min*(n/6);
		answer=Math.min((n/6+1)*min, answer);
		System.out.println(answer);
	}


}
