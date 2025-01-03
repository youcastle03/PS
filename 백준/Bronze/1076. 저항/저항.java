import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		HashMap<String, int[]> Value = new HashMap<String, int[]>() {{
			put("black", new int[]{0, 1});
			put("brown", new int[]{1, 10});
			put("red", new int[]{2, 100});
			put("orange", new int[]{3, 1000});
			put("yellow", new int[]{4, 10000});
			put("green", new int[]{5, 100000});
			put("blue", new int[]{6, 1000000});
			put("violet", new int[]{7, 10000000});
			put("grey", new int[]{8, 100000000});
			put("white", new int[]{9, 1000000000});
		}};

		Scanner sc = new Scanner(System.in);
		String first, second, third;
		first = sc.nextLine();
		second = sc.nextLine();
		third = sc.nextLine();

		String tempString = "";
		tempString += Value.get(first)[0];
		tempString += Value.get(second)[0];
		long answer = Long.parseLong(tempString) * Value.get(third)[1];

		System.out.println(answer);


	}
}