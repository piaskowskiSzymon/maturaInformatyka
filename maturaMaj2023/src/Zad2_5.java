import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2_5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/bin.txt"));
        while (sc.hasNextLine()) {
            String binarna = sc.nextLine();
            int dziesietna = Integer.parseInt(binarna, 2);
            int polowa = dziesietna / 2;
            String p = Integer.toString(polowa, 2);
            String wynik = "1";
            for (int i = 1; i < binarna.length(); i++) {
                if (binarna.charAt(i) == p.charAt(i - 1)) {
                    wynik += "0";
                } else {
                    wynik += "1";
                }
            }
            System.out.println(wynik);
        }
        sc.close();
    }
}
