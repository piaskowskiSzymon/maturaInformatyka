import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2_4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/symbole.txt"));
        int suma = 0;
        while (sc.hasNextLine()) {
            String linia = sc.nextLine();
            suma += trojkowyNaDziesietny(linia);
        }
        String dziesietnie = dziesietnyNaTrojkowy(suma);
        System.out.println(dziesietnie);
        System.out.println(suma);

    }

    public static String dziesietnyNaTrojkowy(int n) {
        if (n == 0) return "o";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int r = n % 3;
            if (r == 0) sb.append("o");
            else if (r == 1) sb.append("+");
            else sb.append("*");
            n = n / 3;
        }
        String wynik = sb.reverse().toString();
        return wynik;
    }

    public static int trojkowyNaDziesietny(String n) {
        int k = n.length();
        int wynik = 0;
        for (int i = 0; i < k; i++) {
            int cyfra;
            char znak = n.charAt(i);
            if (znak == 'o') {
                cyfra = 0;
            } else if (znak == '+') {
                cyfra = 1;
            } else {
                cyfra = 2;
            }
            wynik = wynik * 3 + cyfra;
        }
        return wynik;
    }
}
