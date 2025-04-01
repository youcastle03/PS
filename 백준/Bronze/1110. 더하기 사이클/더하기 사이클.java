import java.util.Scanner;
 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(cycle(n));
		
		
	}
	public static int cycle(int n) {
		int len,left,right,num;
		boolean re=true;
		len=0;
		num=n;
		while(re) {
			if(n<10) {
				left=0;
			}
			else {
				left=n/10;
			}
			right=n%10;
			if((left+right)==10)
				n=right*10;
			else
				n=right*10+((left+right)%10);
		
			if(num==n) {
				re=false;
			}
			len++;
		}
		
		return len;
		
	}

}