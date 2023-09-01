import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class danhsachcanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                x = sc.nextInt();
                if (i <= j && x == 1)
                    System.out.printf("(%d,%d)\n", i, j);
            }
        }
    }
}
