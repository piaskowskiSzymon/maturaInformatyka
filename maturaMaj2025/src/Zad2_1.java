import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/symbole.txt"));
        while (sc.hasNextLine()) {
            String linia = sc.nextLine();
            boolean czyPalindrom = true;
            int n = linia.length();
            for (int i = 0; i < n / 2; i++) {
                if (linia.charAt(i) != linia.charAt(n - 1 - i)) {
                    czyPalindrom = false;
                }
            }
            if (czyPalindrom) {
                System.out.println(linia);
            }
        }
        sc.close();
    }
}
