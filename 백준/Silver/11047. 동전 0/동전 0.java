import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count, charge;
		int cnt=0;
		boolean istrue = true;
		count=sc.nextInt();
		charge=sc.nextInt();
		int coin[] = new int[count];
		for(int i=0; i<count; i++) {
			coin[i]=sc.nextInt();
		}

		for(int i=coin.length-1; i>=0; i--) {
			while(charge>=coin[i]) {
				charge-=coin[i];
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
