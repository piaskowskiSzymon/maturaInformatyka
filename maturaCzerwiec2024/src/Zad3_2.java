import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/slowa.txt"));
        int ilosc = 0;
        String najdluzsze = "";
        while (sc.hasNextLine()) {
            String slowo = sc.nextLine();
            if (kodowanie(slowo).equals(slowo)) {
                ilosc++;
                if (najdluzsze.length() < slowo.length()) {
                    najdluzsze = slowo;
                }
            }
        }
        sc.close();
        System.out.println("ilość słów: " + ilosc);
        System.out.println("Najdłuższe z nich: " + najdluzsze);
    }

    public static String kodowanie(String slowo) {
        StringBuilder sb = new StringBuilder();
        for (char c : slowo.toCharArray()) {
            sb.append((char) ('a' + (c - 'a' + 13) % 26));
        }
        String wynik = sb.reverse().toString();
        return wynik;
    }

}
