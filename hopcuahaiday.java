import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
public class hopcuahaiday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int [] a = new int[1005], b = new int[1005];
        
        for(int i =0 ; i < n; i++){
            int tmp = sc.nextInt();
            a[tmp] = 1;
        }
        for(int i = 0 ;i < m; i++){
            int tmp =  sc.nextInt();
            b[tmp] = 1;
        }
        for(int i =0;i < 1005; i++){
            if(a[i] == 1 || b[i] == 1) System.out.print(i + " ");
        }
    }
}
