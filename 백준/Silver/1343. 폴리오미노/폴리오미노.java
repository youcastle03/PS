import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] tmp;
        tmp = s.split("");
        String answer = "";
       	String temp = "";
    
       	for(int a = 0 ; a<tmp.length; a++) {
        	if(tmp[a].equals("X")) {
        		temp += tmp[a];
        	}
        	else if(temp.length()==0 && !temp.equals("X")) {
        		answer += ".";
        		continue;
        	}
        	if(!tmp[a].equals("X") || (tmp[a].equals("X") && a==tmp.length-1)) {
                String ans = "";

               	if(temp.length() % 4 == 0) {
               		for(int j = 0; j<temp.length(); j++) {
               			ans += "A";
               		}
               	}
               	else if(temp.length()>4 && (temp.length()-2)%4 == 0) {
               		int num = temp.length();
               		for(int i = 0 ; i<num-2; i++) {
               			ans += "A";
               		}
               		ans += "BB";
               	}
               	
               	else if(temp.length()==2) {
               		ans += "BB";
                }
               	
               	else {
               		System.out.println(-1);
               		System.exit(0);
               	}
                answer += ans;
                
                if(a!=tmp.length-1 || (a==tmp.length-1 && !tmp[a].equals("X")))
                	answer += ".";
                temp = "";               	
        	}
        }
       	System.out.println(answer);
       
    }
}
