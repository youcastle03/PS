import java.io.*;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int cnt=0;
        Stack<Character> st=new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                st.push(str.charAt(i));
            }
            else{
                st.pop();
                if(str.charAt(i-1)=='('){
                    cnt+=st.size();
                }
                else{
                    cnt+=1;
                }
            }
        }
        System.out.println(cnt);
    }
}