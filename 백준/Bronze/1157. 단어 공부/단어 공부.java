import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		String a=input.nextLine();
		int[] b = new int[26];
		int max=0;
		char c='?';
		a=a.toUpperCase();
		for(int i=0; i<a.length(); i++) {
			b[a.charAt(i)-65]+=1;
		}
		for(int i=0; i<b.length; i++) {
			if(b[i]>max) {
				max=b[i];
				c=(char)(i+65);
			}
			else if(max!=0&&b[i]==max) {
				c='?';
				
			}
			
		}
		
		System.out.println(c);
		input.close();
	}
}	
