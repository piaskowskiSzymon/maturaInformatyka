import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/slowa.txt"));
        int iloscSlow = 0;
        while (sc.hasNextLine()) {
            String slowo = sc.nextLine();
            boolean czyZnaleziono = false;
            for (int i = 0; i < slowo.length() - 2; i++) {
                if (slowo.charAt(i) == 'k' && slowo.charAt(i + 2) == 't') {
                    czyZnaleziono = true;
                    break;
                }
            }
            if (czyZnaleziono) {
                iloscSlow++;
            }
        }
        sc.close();
        System.out.println(iloscSlow);
    }
}
