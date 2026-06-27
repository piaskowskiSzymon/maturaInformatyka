import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad4_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/liczby.txt"));
        List<Integer> liczbyPierwsze = new ArrayList<>();
        List<Integer> liczby = new ArrayList<>();
        String linia = sc.nextLine();
        String[] split = linia.split(" ");
        for (int i = 0; i < split.length; i++) {
            int liczbaPierwsza = Integer.parseInt(split[i]);
            liczbyPierwsze.add(liczbaPierwsza);
        }
        String linia2 = sc.nextLine();
        String[] split2 = linia2.split(" ");
        for (int i = 0; i < split2.length; i++) {
            int liczba = Integer.parseInt(split2[i]);
            liczby.add(liczba);
        }
        sc.close();
        int iloscDzielnikow = 0;
        for (int i : liczbyPierwsze) {
            for (int j : liczby) {
                if (j % i == 0) {
                    iloscDzielnikow++;
                    break;
                }
            }
        }
        System.out.println(iloscDzielnikow);
    }
}
