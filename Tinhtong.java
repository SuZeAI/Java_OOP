import java.util.Scanner;

public class Tinhtong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long sum = n * (n + 1);
            System.out.println(sum/2);
        }
    }
}
