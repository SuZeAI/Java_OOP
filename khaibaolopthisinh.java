import java.util.*;
import java.util.function.BinaryOperator;
import java.lang.Math;
import java.lang.Character;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class khaibaolopthisinh {
    public static void main(String[] args) {
        Student student = new Student();
        student.Input();
        student.Output();
    }
}
class Student {
    String name;
    String date;
    float point1, point2, point3, sumPoint;

    void Input() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        date = sc.next();
        point1 = sc.nextFloat();
        point2 = sc.nextFloat();
        point3 = sc.nextFloat();
        sumPoint = point1 + point2 + point3;
    }

    void Output() {
        System.out.printf("%s %s %.1f", name, date, sumPoint);
    }
}