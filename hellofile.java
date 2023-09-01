import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class hellofile {
    public static void main(String[] args) {
        String ten = "Hello.txt";
        try{
            FileReader fileReader = new FileReader(ten);
            BufferedReader bf = new BufferedReader(fileReader);
            String dong;
            while((dong = bf.readLine()) != null){
                System.out.println(dong);
            }
            bf.close();
        }catch (IOException e){
            e.printStackTrace();;
        }
        
    }
}