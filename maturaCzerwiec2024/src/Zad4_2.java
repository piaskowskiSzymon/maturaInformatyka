import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zad4_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/odbiorcy.txt"));
        int n = 1024;
        Set<Integer> odbiorcy = new HashSet<>();
        while (sc.hasNextLine()) {
            int odbiorca = Integer.parseInt(sc.nextLine());
            odbiorcy.add(odbiorca);
        }
        int iloscKtoreMajaOdbiorce = 0;
        for (int i = 0; i < odbiorcy.size(); i++) {
            iloscKtoreMajaOdbiorce++;
        }
        int iloscBezOdbiorcy = n - iloscKtoreMajaOdbiorce;
        sc.close();
        System.out.println(iloscBezOdbiorcy);
    }
}
