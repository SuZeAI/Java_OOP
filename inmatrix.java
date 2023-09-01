import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class inmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[][] = new int[n][n];
            for(int i = 0 ;i < n; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            int i = 0;
            while(i < n){
                if(i % 2 == 1){
                    for(int j = n - 1; j >= 0; j--) System.out.printf("%d ", a[i][j]);
                }
                else{
                    for(int j = 0; j < n; j++) System.out.printf("%d ", a[i][j]);
                }
                i++;
            }
            System.out.println();
        }
    }
}
