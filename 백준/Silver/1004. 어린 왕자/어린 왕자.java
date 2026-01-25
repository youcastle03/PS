import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T,num,x1,y1,x2,y2,n,cx,cy,r;
        T = sc.nextInt();
        num = 0;

        while(T-- > 0) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            n = sc.nextInt();
            while(n-- > 0) {
                cx = sc.nextInt();
                cy = sc.nextInt();
                r = sc.nextInt();
                if(Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) < Math.pow(r, 2) && Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) < Math.pow(r, 2)) {
                    continue;
                }else if(Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) < Math.pow(r, 2) || Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) < Math.pow(r, 2)) {
                    num++;
                }
            }
            System.out.println(num);
            num = 0;
        }
    }
}