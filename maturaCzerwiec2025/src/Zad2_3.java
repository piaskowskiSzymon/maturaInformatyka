import java.io.InputStream;
import java.util.Scanner;

public class Zad2_3 {
    public static void main(String[] args) {
        InputStream stream = Zad2_3.class.getClassLoader().getResourceAsStream("liczby2.txt");
        Scanner sc = new Scanner(stream);
        int maxStopien = 0;
        int maxliczba = -1;
        while (sc.hasNextLine()) {
            int liczba = Integer.parseInt(sc.nextLine());
            int kwadratLiczby = (int) Math.pow(liczba, 2);
            int dlugosc = 0;
            int x = kwadratLiczby;
            while (x > 0) {
                dlugosc++;
                x /= 10;
            }
            int stopien = 0;
            for (int i = 0; i < dlugosc; i++) {
                int potega = (int) Math.pow(10, i);
                int a = kwadratLiczby / potega;
                int b = kwadratLiczby % potega;
                if (a + b <= liczba) {
                    stopien++;
                }
            }
            if (stopien > maxStopien) {
                maxStopien = stopien;
                maxliczba = liczba;
            }
        }
        System.out.println(maxStopien);
        System.out.println(maxliczba);
    }
}
