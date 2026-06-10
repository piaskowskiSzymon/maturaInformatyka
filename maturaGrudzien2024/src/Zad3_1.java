import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/liczby.txt"));
        int pierwsza = -1;
        int iloscLiczb = 0;
        while (sc.hasNextLine()) {
            int liczba = Integer.parseInt(sc.nextLine());
            int pierwiastek = (int) Math.round(Math.sqrt(liczba));

            if (pierwiastek * pierwiastek == liczba) {
                iloscLiczb++;
                if (pierwsza == -1) {
                    pierwsza = liczba;
                }
            }
        }
        sc.close();
        System.out.println(pierwsza);
        System.out.println(iloscLiczb);
    }
}
