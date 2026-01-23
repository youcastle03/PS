import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        LinkedList<String> list = new LinkedList<>();
        for (int i = 2; i < s.length(); i++) {
            for (int j = 1; j < i; j++) {
                StringBuilder strSb1 = new StringBuilder(s.substring(0, j));
                StringBuilder strSb2 = new StringBuilder(s.substring(j, i));
                StringBuilder strSb3 = new StringBuilder(s.substring(i));
                String s1 = strSb1.reverse().toString();
                String s2 = strSb2.reverse().toString();
                String s3 = strSb3.reverse().toString();
                list.add(s1 + s2 + s3);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}