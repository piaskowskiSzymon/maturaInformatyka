import java.io.InputStream;
import java.util.Scanner;

public class Zad2_2 {
    public static void main(String[] args) {
        InputStream stream = Zad2_2.class.getClassLoader().getResourceAsStream("liczby1.txt");
        Scanner sc = new Scanner(stream);
        int ilosc = 0;
        while (sc.hasNextLine()) {
            int liczba = Integer.parseInt(sc.nextLine());
            int x = liczba;
            int dlugosc = 0;
            while (x > 0) {
                dlugosc++;
                x /= 10;
            }
            int potega = 1;
            int b = 0;
            for (int i = 1; i <= dlugosc / 2; i++) {
                b = b + (potega * (liczba % 10));
                liczba /= 10;
                potega = potega * 10;
            }
            int a = liczba;
            int wynik = Euklides(a, b);
            if (wynik == 1) {
                ilosc++;
            }
        }
        System.out.println(ilosc);

    }

    public static int Euklides(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
}
