import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int e,s,m,year,e2,s2,m2;
		e=sc.nextInt();
		s=sc.nextInt();
		m=sc.nextInt();
		e2=e;
		s2=s;
		m2=m;
		year=1;
		e=1;
		s=1;
		m=1;
		while(true) {
		
			if(e==e2&&s==s2&&m==m2) {
				break;
			}
			e+=1;
			s+=1;
			m+=1;
			year+=1;
			
			if(e>15) {
				e-=15;
			}
			if(s>28) {
				s-=28;
			}
			if(m>19) {
				m-=19;
			}
		
		}
		System.out.println(year);
	}
}