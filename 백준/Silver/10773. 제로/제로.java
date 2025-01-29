import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args)  {
        Stack<Integer> st = new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int num=sc.nextInt();

            if(num==0){
                st.pop();
            }
            else{
                st.push(num);
            }
        }
        for(int a:st){
            sum+=a;
        }
        System.out.println(sum);
    }
}