import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int[] stack = new int[1000000];
    static int top = 0;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "1" : push(Integer.parseInt(st.nextToken())); break;
                case "2" : pop(); break;
                case "3" : size(); break;
                case "4" : empty(); break;
                case "5" : peek(); break;
            }
        }
        System.out.print(sb.toString());
    }

    static void push(int n) {
        stack[top++] = n;
    }
    static void pop() {
        if(top > 0) sb.append(stack[--top]).append("\n");
        else sb.append(-1).append("\n");
    }
    static void size() {
        sb.append(top).append("\n");
    }
    static void empty(){
        if(top == 0) sb.append(1).append("\n");
        else sb.append(0).append("\n");
    }
    static void peek() {
        if(top == 0) sb.append(-1).append("\n");
        else sb.append(stack[top-1]).append("\n");
    }

}