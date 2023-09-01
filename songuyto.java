import java.util.*;
public class songuyto {

    static boolean snt(long n){
        if(n == 1) return false;
        for(int i = 2;i * i <= n; i++){
            if(n % i == 0) return false;
        }    
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(snt(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
