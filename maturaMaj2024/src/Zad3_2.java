import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/skrot.txt"));
        int najwieksza = 0;
        int ilosc = 0;
        while (sc.hasNextLine()) {
            int liczba = Integer.parseInt(sc.nextLine());
            if (nieparzystySkrot(liczba) == 0) {
                ilosc++;
                if (liczba > najwieksza) {
                    najwieksza = liczba;
                }
            }
        }
        sc.close();
        System.out.println(ilosc);
        System.out.println(najwieksza);
    }

    public static int nieparzystySkrot(int n) {
        int m = 0;
        int p = 1;
        while (n > 0) {
            int cyfra = n % 10;
            if (cyfra % 2 != 0) {
                m += cyfra * p;
                p *= 10;
            }
            n /= 10;
        }
        return m;
    }
}
