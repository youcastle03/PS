import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int N=0;
        for(int i = 0; i < 3; i++) {
            s=br.readLine();
            if(!s.equals("Fizz")&&!s.equals("Buzz")&&!s.equals("FizzBuzz")){
              N = Integer.parseInt(s)+(3-i);
              break;
            }
        }
        if(N%3==0&&N%5==0){
            System.out.println("FizzBuzz");
        }
        else if(N%3==0){
            System.out.println("Fizz");
        }
        else if(N%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(N);
        }

    }
}
