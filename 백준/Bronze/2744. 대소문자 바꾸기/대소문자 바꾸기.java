import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] >= 'a' && chars[i] <= 'z'){
                chars[i]-=32;
            }
            else if(chars[i] >= 'A' &&  chars[i] <= 'Z'){
                chars[i]+=32;
            }
        }
        System.out.println(chars);

    }
}