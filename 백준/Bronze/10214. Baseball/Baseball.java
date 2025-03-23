import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int yonsei = 0;
        int korea = 0;
        int yCount = 0;
        int kCount = 0;
        String answer = "";

        for (int i = 0; i < num; i++) {
            yCount = 0;
            kCount = 0;
            for (int j = 0; j < 9; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                yonsei = Integer.parseInt(st.nextToken());
                korea = Integer.parseInt(st.nextToken());

                yCount+= yonsei;
                kCount+= korea;
            }

            if (yCount > kCount) {
                answer = "Yonsei";
            } else if (yCount == kCount) {
                answer = "Draw";
            } else {
                answer = "Korea";
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}