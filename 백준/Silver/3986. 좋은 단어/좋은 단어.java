import java.io.*;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> st=new Stack<Character>();

        int n=Integer.parseInt(br.readLine());
        int result=0;
        for(int i=0; i<n; i++ ){
            String str=br.readLine();
            for(int j=0; j<str.length(); j++){
                if(!st.isEmpty()&&st.peek()==str.charAt(j)){
                    st.pop();
                }
                else{
                    st.push(str.charAt(j));
                }
            }
            if(st.isEmpty()){
                result++;
            }
            st.clear();
        }
        System.out.println(result);
    }
}