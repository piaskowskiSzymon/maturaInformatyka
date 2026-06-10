import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zad3_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/liczby.txt"));
        while (sc.hasNextLine()) {
            int liczba = Integer.parseInt(sc.nextLine());
            Set<Integer> dzielnikiLiczby = DzielnikiPierwsze(liczba);

            if (dzielnikiLiczby.size() >= 5) {
                System.out.println(liczba);
            }
        }
        sc.close();
    }

    public static Set<Integer> DzielnikiPierwsze(int n) {
        Set<Integer> dzielniki = new HashSet<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                dzielniki.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            dzielniki.add(n);
        }
        return dzielniki;
    }
}
