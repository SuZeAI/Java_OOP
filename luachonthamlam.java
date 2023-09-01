import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;
public class luachonthamlam {
    static int nxt(Scanner sc){
        int x = sc.nextInt();
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nxt(sc);
        int b =nxt(sc);
        int [] arr = new int[n];
        if (n * 9 < b || b == 0){
            System.out.printf("%d %d\n", -1, -1);
        }
        else{
            for(int i = n - 1; i >= 0; i--){
                while(b > 0 && arr[i] < 9){
                    arr[i]++;
                    b--;
                }
            }
            if(arr[0] == 0){
                int idx = -1;
                for(int i = 0; i < n; i++){
                    if(arr[i] != 0){
                        idx = i;
                        break;
                    }
                }
                System.out.print(1);
                for(int i = 1; i < idx; i++) System.out.print(0);
                System.out.print(arr[idx] - 1);
                for(int i = idx + 1; i < n; i++) System.out.print(arr[i]);

            }
            else for(int i = 0;i < n; i++) System.out.print(arr[i]);
            System.out.print(" ");
            for(int i = n - 1; i >= 0; i--) System.out.print(arr[i]);
        }

    }
}