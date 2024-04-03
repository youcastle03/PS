import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class Main {
	static int max=0;
	static int[] a;
	static int m;
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		a=new int[n+1];
		a[0]=0;
		st=new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		back(0,1,0);
		System.out.println(max);
	}
	/*
	 * @param index 현재위치
	 * @param snow 현재 크기
	 * @param time 몇초인지
	 */
	static void back(int index, int snow,int time) {
		
		if(time==m||index>n) {
			return;
		}
		
		time++;
		//1칸
		if(index+1<=n) {
			snow+=a[index+1];
			if(snow>max) {
				max=snow;
			}
			back(index+1,snow,time);
			snow-=a[index+1];
		}
		//2칸
		if(index+2<=n) {
			snow/=2;
			snow+=a[index+2];
			if(snow>max) {
				max=snow;
			}
			back(index+2,snow,time);
		}
		
	}
	
}