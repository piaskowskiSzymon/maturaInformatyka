import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/dron.txt"));
        int ilosc = 0;
        while (sc.hasNextLine()) {
            String linia = sc.nextLine();
            String[] split = linia.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            if (Euklides(a, b) > 1) {
                ilosc++;
            }
        }
        sc.close();
        System.out.println(ilosc);
    }

    public static int Euklides(int a, int b) {
        if (b == 0) {
            return a;
        }
        int aBezwzgledne = Math.abs(a);
        int bBezwzgledne = Math.abs(b);
        while (aBezwzgledne != bBezwzgledne) {
            if (aBezwzgledne > bBezwzgledne) {
                aBezwzgledne -= bBezwzgledne;
            } else {
                bBezwzgledne -= aBezwzgledne;
            }
        }
        return aBezwzgledne;
    }
}
