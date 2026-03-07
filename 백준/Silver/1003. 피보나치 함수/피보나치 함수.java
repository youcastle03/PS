import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	 BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter sw=new BufferedWriter(new OutputStreamWriter(System.out));
         int n=Integer.parseInt(sc.readLine());
         int num;
         Integer[] num0=new Integer[41];
         Integer[] num1=new Integer[41];
         num0[0]=1; num0[1]=0;
         num1[0]=0; num1[1]=1;
         for(int i=0; i<n; i++) {
             num = Integer.parseInt(sc.readLine());
             for(int j=2; j<=num; j++) {
                 num0[j] = num0[j-2] + num0[j-1];
                 num1[j] = num1[j-2] + num1[j-1];
             }
             sw.write(num0[num]+ " " +num1[num]+"\n");
         }
         sw.close();
         sc.close();
    }
}
