import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.next();
        }
        boolean dif;
        for (int i=0; i<arr[0].length(); i++){
            dif = false;
            for (int j=0; j<n-1; j++){
                if (arr[j].charAt(i)!=arr[j+1].charAt(i)){
                    dif = true;
                    break;
                }
            }
            if (dif)
                System.out.print("?");
            else
                System.out.print(arr[0].charAt(i));
        }
    }
}