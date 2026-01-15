import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++) {
            b[i] = sc.nextInt();
        }
        for(int i=0; i<b.length; i++){
            if(bisearch(a,b[i])){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
    static boolean bisearch(int[] a, int b){
        int first=0;
        int last=a.length-1;
        int mid=0;
        while(first<=last){
            mid=(first+last)/2;
            if(a[mid]==b){
                return true;
            }
            if(a[mid]>b){
                last=mid-1;
            }
            else{
                first=mid+1;
            }
        }
        return false;
    }
}
