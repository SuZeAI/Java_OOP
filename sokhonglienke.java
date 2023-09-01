import java.util.Scanner;
import java.lang.Math;
public class sokhonglienke {
    static boolean check1(Long n){
        long sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        if(sum % 10 == 0) return true;
        return false;
    }
    static boolean check2(String s){
        for(int i = 1;i < s.length(); i++){
            if(Math.abs(s.charAt(i) - s.charAt(i - 1)) != 2) return false;
        }
        return true;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(check1(n) && check2(Long.toString(n))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
