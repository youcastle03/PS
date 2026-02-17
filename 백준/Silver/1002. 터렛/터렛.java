import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st=new StringTokenizer(br.readLine());

            int x1=Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int r1=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());
            int r2=Integer.parseInt(st.nextToken());

            //int dis=(int)(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

            int dis=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
            if(x1==x2&&y1==y2&&r1==r2){
                sb.append(-1).append("\n");
            }
            else if(dis>(r1+r2)*(r1+r2)){
                sb.append(0).append("\n");
            }
            else if(dis<(r2-r1)*(r2-r1)){
                sb.append(0).append("\n");
            }
            else  if(dis == (r2-r1)*(r2-r1)){
                sb.append(1).append("\n");
            }
            else if(dis==(r2+r1)*(r2+r1)){
                sb.append(1).append("\n");
            }
            else{
                sb.append(2).append("\n");
            }

        }
        System.out.println(sb);
    }
}