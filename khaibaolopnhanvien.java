import java.util.Scanner;

class NhanVien {
    String maNV;
    String ten;
    String gioiTinh;
    String ngaySinh;
    String diaChi;
    String maSoThue;
    String ngayKiHopDong;

    void Input() {
        Scanner sc = new Scanner(System.in);
        maNV = "00001";
        ten = sc.nextLine();
        gioiTinh = sc.next();
        ngaySinh = sc.next();
        sc.nextLine();
        diaChi = sc.nextLine();
        maSoThue = sc.next();
        ngayKiHopDong = sc.next();
    }

    void Output() {
        System.out.printf("%s %s %s %s %s %s %s", maNV, ten, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKiHopDong);
    }
}

public class khaibaolopnhanvien {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.Input();
        nv.Output();
    }
}