import java.io.InputStream;
import java.util.Scanner;

public class Zad3_1 {
    public static void main(String[] args) {
        InputStream stream = Zad3_1.class.getClassLoader().getResourceAsStream("dane.txt");
        Scanner sc = new Scanner(stream);
        String linia = sc.nextLine();
        String[] split = linia.split("");
        int ileLiczb = 0;
        boolean czyPoczatek = true;
        for (int i = 0; i < split.length - 1; i++) {
            if (i == 0) {
                if (split[i].equals("5") && split[i + 1].equals("0")) {
                    ileLiczb++;
                }
                continue;
            }
            if (split[i - 1].codePointAt(0) > 47 && split[i - 1].codePointAt(0) < 58) {
                czyPoczatek = true;
            } else {
                czyPoczatek = false;
            }
            if (split[i].equals("5") && split[i + 1].equals("0") && !czyPoczatek) {
                ileLiczb++;
            }
        }
        System.out.println(ileLiczb);
    }
}
