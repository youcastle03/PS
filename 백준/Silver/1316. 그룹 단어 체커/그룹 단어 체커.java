import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;

        for(int t=0; t<n; t++){
            int[] check=new int[26];
            boolean a=true;
            String s=sc.next();

            for(int i=0; i<s.length(); i++){
                if(check[s.charAt(i)-'a']==1){
                    if(s.charAt(i)!=s.charAt(i-1)){
                        a=false;
                        break;
                    }
                }
                else{
                    check[s.charAt(i)-'a']=1;
                }
            }
            if(a){
                result++;
            }

        }
        System.out.println(result);
    }

}