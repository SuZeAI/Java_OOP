import java.util.Scanner;
import java.lang.Math;
public class hinhvuong {
    public static void  main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();

        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int d2 = sc.nextInt();
        int x1 = Math.min(a1, a2);
        int x2 = Math.max(c1, c2);
        int y1 = Math.min(b1, b2);
        int y2 = Math.max(d1, d2);
        int cd = Math.max(x2 - x1, y2 - y1);
        System.out.println(cd * cd);
    }
}
