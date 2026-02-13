import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();
        String searchWord = br.readLine();
        int answer = 0;
        while (words.contains(searchWord)) {
            words = words.replaceFirst(searchWord, "_");
            answer++;
        }
        System.out.println(answer);

    }
}