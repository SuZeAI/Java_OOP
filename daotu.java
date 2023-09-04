import java.util.*;
import java.lang.Math;
import java.lang.Character;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class daotu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String [] str = s.split(" ");
            for(String tmp : str){
                StringBuilder st = new StringBuilder(tmp).reverse();
                System.out.print(st + " ");
                
        }
        System.out.println();
    }   
    }
}
