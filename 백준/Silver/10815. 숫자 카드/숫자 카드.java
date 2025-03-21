import java.util.*;
public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] card = new int[n];
		for(int i = 0; i < n; i++) {
			card[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] check = new int[m];
		for(int i = 0; i < m; i++) {
			check[i] = sc.nextInt();
		}
		Arrays.sort(card);
		for(int i = 0; i < m; i++) {
			System.out.print(binarySearch(card, check[i]) + " ");
		}	
		System.out.println();
		sc.close();
	}
	public static int binarySearch(int[] array, int n) {
		int start = 0;
		int end = array.length-1; 
		int mid = 0;

		while (start <= end) {
			mid = (start + end) / 2;
			if(array[mid] == n) {
				return 1;
				
			}else {
				if(array[mid] < n) {
					start = mid+1;
				}else {
					end = mid-1;
				}
			}
		}
		return 0;
	}

}