
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] sort;
		int count,a,digit,temp;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		count=0;
		digit=1;
		for(int i=a; i>10; i=i/10) {
			count++;
			digit=digit*10;
		}
		count++;
		
		sort = new int[count];
		
		
		for(int i=0; a>0; i++) {
			if(a>=10) {
				sort[i]=a/digit;
				a=a%digit;
				digit=digit/10;
			}
			else {
				sort[i]=a;
				a=0;
			}
		}
		
	
		
		for(int i=0; i<sort.length; i++) {
			for(int j=0; j<sort.length-1; j++) {
				if(sort[j]<sort[j+1]) {
					temp=sort[j];
					sort[j]=sort[j+1];
					sort[j+1]=temp;
				}
			}
		}
		for(int i=0; i<sort.length; i++) {
			System.out.print(sort[i]);
			
		} 
	
	}
	
}
