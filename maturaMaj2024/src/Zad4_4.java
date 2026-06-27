import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad4_4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/liczby.txt"));
        List<Integer> liczbyPierwsze = new ArrayList<>();
        String linia = sc.nextLine();
        String[] split = linia.split(" ");
        for (int i = 0; i < split.length; i++) {
            int liczbaPierwsza = Integer.parseInt(split[i]);
            liczbyPierwsze.add(liczbaPierwsza);
        }
        sc.close();

        int n = liczbyPierwsze.size();
        double najlepszaSrednia = -1;
        int najlepszaDlugosc = 0;
        int najlepszyPoczatek = 0;

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + liczbyPierwsze.get(i);
        }

        for (int start = 0; start < n; start++) {
            for (int end = start + 50; end <= n; end++) {
                int dlugosc = end - start;
                double srednia = (double) (prefix[end] - prefix[start]) / dlugosc;

                if (srednia > najlepszaSrednia) {
                    najlepszaSrednia = srednia;
                    najlepszaDlugosc = dlugosc;
                    najlepszyPoczatek = start;
                }
            }
        }

        System.out.println(najlepszaSrednia);
        System.out.println(najlepszaDlugosc);
        System.out.println(liczbyPierwsze.get(najlepszyPoczatek));
    }
}
