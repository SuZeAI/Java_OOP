import java.util.Scanner;

public class tinhthuthapgiavien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GV gv = new GV();
        gv.input(sc);
        gv.output();
        sc.close();
    }    
}

class GV {
    String maNgach;
    String hoTen;
    int bacLuong;
    int luongCoBan;
    int phuCap;
    int thuNhap;

    void input(Scanner sc) {
        maNgach = sc.nextLine();
        hoTen = sc.nextLine();
        luongCoBan = sc.nextInt();
        if (maNgach.substring(0, 2).compareTo("HT") == 0)
            phuCap = 2000000;
        else if (maNgach.substring(0, 2).compareTo("HP") == 0)
            phuCap = 900000;
        else
            phuCap = 500000;
        bacLuong = (maNgach.charAt(2) - '0') * 10 + maNgach.charAt(3) - '0';
        thuNhap = bacLuong * luongCoBan + phuCap;
    }

    void output() {
        System.out.printf("%s %s %d %d %d", maNgach, hoTen, bacLuong, phuCap, thuNhap);
    }
}