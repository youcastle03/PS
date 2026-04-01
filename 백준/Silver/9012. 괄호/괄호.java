import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        boolean VPS=true;
        for(int i=0; i<n; i++){
            Stack<Character> st=new Stack<>();
            String a=br.readLine();
            for(int j=0; j<a.length(); j++) {
                if (a.charAt(j) == '(') {
                    st.push(a.charAt(j));
                } else if (a.charAt(j) == ')') {
                    if (st.isEmpty()) {
                        sb.append("NO\n");
                        VPS = false;
                        break;
                    } else {
                        st.pop();
                    }
                }

            }
            if(!st.isEmpty()){
                VPS=false;
                sb.append("NO\n");
            }
            if(VPS){
                sb.append("YES\n");
            }
            else{
                VPS=true;
            }

        }
        System.out.println(sb);

    }
}