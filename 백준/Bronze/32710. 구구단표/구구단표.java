import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = 1; 
        int j = 1;
		
		for(i = 1; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				if(i * j == a) {
					break;
				}
			}
			if(j < 10) {
				break;
			}
		}
		
		if(i < 10 && j < 10 || 1 <= a && a <= 9) {
			System.out.println("1");
		}
        else {
			System.out.println("0");
		}
	}
}