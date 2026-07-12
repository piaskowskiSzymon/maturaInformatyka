import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2_3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/bin.txt"));
        int najwiekszaDziesietna = 0;
        while (sc.hasNextLine()) {
            String binarna = sc.nextLine();
            int dziesietna = Integer.parseInt(binarna, 2);
            if (dziesietna > najwiekszaDziesietna) {
                najwiekszaDziesietna = dziesietna;
            }
        }
        sc.close();
        System.out.println(Integer.toString(najwiekszaDziesietna, 2));
    }
}
