import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=1;  //지금이 몇번째인지
		int num=1; //현재숫자
		int n=1; //n이 num갯수만큼
		int sum=0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		while(true) {
			if(count==a) {
				break;
			}
			if(n==num) {
				num++;
				n=0;
			}
			n++;
			count++;
			
		}

		for(int i=count; i<=b; i++) {
			sum+=num;
			if(n==num) {
				num++;
				n=0;
			}
			count++;
			n++;
		}
		System.out.println(sum);
	}
}
