import java.util.*;
import java.util.function.BinaryOperator;
import java.lang.Math;
import java.lang.Character;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class Fraction {
    long numerator;
    long denominator;
    static Scanner sc = new Scanner(System.in);

    void Input() {
        numerator = sc.nextLong();
        denominator = sc.nextLong();
    }

    void Output() {
        System.out.printf("%d/%d", numerator, denominator);
    }

    void Compact() {
        Long a = numerator;
        Long b = denominator;
        while (a != 0) {
            Long x = a;
            a = b % a;
            b = x;
        }
        numerator /= b;
        denominator /= b;
    }

    Fraction Add(Fraction b) {
        Fraction c = new Fraction();
        c.denominator = denominator * b.denominator;
        c.numerator = numerator * b.denominator + denominator * b.numerator;
        c.Compact();
        return c;
    }
}

public class tongphanso {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        a.Input();
        b.Input();
        Fraction c = a.Add(b);
        c.Output();
    }
}