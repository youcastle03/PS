
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<student> s= new ArrayList<student>();
		for(int i=0; i<n; i++) {
			String str=sc.next();
			int k=sc.nextInt();
			int e=sc.nextInt();
			int m=sc.nextInt();
			student a=new student(str,k,e,m);
			s.add(a);
		}
		Collections.sort(s, new Comparator<student>(){ 
			@Override 
			public int compare(student s1, student s2) { 
				if(s1.kor<s2.kor) { 
					return 1;
				}
				else if(s1.kor>s2.kor){
					return -1;
				}
				else {
					if(s1.eng<s2.eng) {
						return -1;
					}
					else if(s1.eng>s2.eng){
						return 1;
					}
					else {
						if(s1.math<s2.math) { 
							return 1;
						}
						else if(s1.math>s2.math){
							return -1;
						}
						else {
							return s1.name.compareTo(s2.name);
										
						}				
					}				
				}


			} 
		});
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i).getName());
		}

	}
}
class student{
	String name;
	int kor;
	int eng;
	int math;
	student(String s,int k, int e, int m){
		setName(s);
		setKor(k);
		setEng(e);
		setMath(m);
	}
	void setName(String s) {
		this.name=s;
	}
	void setKor(int k) {
		this.kor=k;
	}
	void setEng(int e) {
		this.eng=e;

	}
	void setMath(int m) {
		this.math=m;
	}
	String getName() {
		return this.name;
	}
	int getKor() {
		return this.kor;
	}
	int getEng() {
		return this.eng;

	}
	int getMath() {
		return this.math;
	}
}
