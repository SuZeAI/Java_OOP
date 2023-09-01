import java.util.Scanner;
public class Giaipt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat() * -1;
        if(a == 0 && b != 0) System.out.println("VN");
        else if(a == 0 && b == 0) System.out.print("VSN");
        else System.out.printf("%.2f", b/a);
    }
}
