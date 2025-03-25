import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int count = 0;
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i=0; i<str1.length(); i++) {
            count1[str1.charAt(i)-'a']++;
        }
        for(int i=0; i<str2.length(); i++) {
            count2[str2.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            int num = count1[i]-count2[i];
            if(num !=0){
                count += Math.abs(num);
            }
        }
        
        System.out.println(count);

    }
}