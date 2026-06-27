import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad4_3 {
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
        List<Integer> poprawneLiczby = new ArrayList<>();
        for (int i : liczby) {
            int liczba = i;
            for (int j : liczbyPierwsze) {
                if (i == 1) {
                    poprawneLiczby.add(liczba);
                    break;
                }
                if (i % j == 0) {
                    i /= j;
                }
            }
        }
        for (int i : poprawneLiczby) {
            System.out.println(i);
        }
    }
}
