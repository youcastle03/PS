import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int[][] answer = new int[size][2];
		
		for(int i = 0; i < size; i++) {
			answer[i][0] = input.nextInt(); // k층
			answer[i][1] = input.nextInt(); // n호
		}
		
		int[][] apartment = new int[15][15];
		for(int i = 1; i < apartment.length; i++) {
			apartment[0][i] = i;
		}
	
		for(int i = 1; i < apartment.length; i++) {
			for(int j = 1; j < apartment.length; j++) {
				apartment[i][j] = apartment[i][j-1] + apartment[i-1][j];
//				System.out.print(apartment[i][j] + " ");
			}
//			System.out.println();
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(apartment[answer[i][0]][answer[i][1]]);
		}
		
		input.close();
	}
}