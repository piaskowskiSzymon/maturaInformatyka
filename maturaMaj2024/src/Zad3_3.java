import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3_3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/skrot2.txt"));
        while (sc.hasNextLine()) {
            int liczba = Integer.parseInt(sc.nextLine());
            int skrot = nieparzystySkrot(liczba);
            if (Euklides(liczba, skrot) == 7) {
                System.out.println(liczba);
            }
        }
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
