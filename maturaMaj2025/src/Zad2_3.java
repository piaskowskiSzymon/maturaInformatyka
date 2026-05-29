import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2_3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/symbole.txt"));
        int maxWartosc = -1;
        String maxNapis = "";
        while (sc.hasNextLine()) {
            String linia = sc.nextLine();
            int wartosc = trojkowyNaDziesietny(linia);
            if (wartosc > maxWartosc) {
                maxNapis = linia;
                maxWartosc = wartosc;
            }
        }
        sc.close();
        System.out.println(maxNapis);
        System.out.println(maxWartosc);
    }

    public static int trojkowyNaDziesietny(String n) {
        int k = n.length();
        int wynik = 0;
        for (int i = 0; i < k; i++) {
            int cyfra;
            char znak = n.charAt(i);
            if (znak == 'o') {
                cyfra = 0;
            } else if (znak == '+') {
                cyfra = 1;
            } else {
                cyfra = 2;
            }
            wynik = wynik * 3 + cyfra;
        }
        return wynik;
    }
}
