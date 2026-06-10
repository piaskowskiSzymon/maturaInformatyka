import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/prostokaty.txt"));
        int najmniejsze = 1000000000;
        int najwiekszy = -1;
        while (sc.hasNextLine()) {
            String linia = sc.nextLine();
            String[] split = linia.split(" ");
            int wysokosc = Integer.parseInt(split[0]);
            int szerokosc = Integer.parseInt(split[1]);
            if (wysokosc * szerokosc > najwiekszy) {
                najwiekszy = wysokosc * szerokosc;
            }
            if (wysokosc * szerokosc < najmniejsze) {
                najmniejsze = wysokosc * szerokosc;
            }
        }
        sc.close();
        System.out.println("Najwieksze pole: " + najwiekszy);
        System.out.println("Najmniejsze pole: " + najmniejsze);
    }
}
