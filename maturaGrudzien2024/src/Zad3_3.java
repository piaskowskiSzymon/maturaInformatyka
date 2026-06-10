import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Zad3_3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/liczby.txt"));
        int mniejsza = 0;
        int wieksza = 0;
        int rowna = 0;
        while (sc.hasNextLine()) {
            int liczba = Integer.parseInt(sc.nextLine());
            int roznica = ObliczRoznice(liczba);

            if (roznica > liczba) {
                wieksza++;
            } else if (roznica < liczba) {
                mniejsza++;
            } else {
                rowna++;
                System.out.println(liczba);
            }
        }
        sc.close();
        System.out.println("Ilość równych: " + rowna);
        System.out.println("Ilość większych: " + wieksza);
        System.out.println("Ilość mniejszych: " + mniejsza);
    }

    public static int ObliczRoznice(int n) {
        int[] cyfry = new int[4];
        for (int i = 3; i >= 0; i--) {
            cyfry[i] = n % 10;
            n /= 10;
        }
        Arrays.sort(cyfry);
        int najwieksza = cyfry[3] * 1000 + cyfry[2] * 100 + cyfry[1] * 10 + cyfry[0];
        int najmniejsza = cyfry[0] * 1000 + cyfry[1] * 100 + cyfry[2] * 10 + cyfry[3];
        int wynik = najwieksza - najmniejsza;
        return wynik;
    }
}
