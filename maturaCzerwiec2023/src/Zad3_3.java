import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3_3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/anagram.txt"));
        List<String> binarne = new ArrayList<>();
        while (sc.hasNextLine()) {
            String linia = sc.nextLine();
            binarne.add(linia);
        }
        sc.close();
        int najwiekszaRoznica = 0;
        for (int i = 0; i < binarne.size() - 1; i++) {
            String binarna1 = binarne.get(i);
            int liczba1 = Integer.parseInt(binarna1, 2);
            String binarna2 = binarne.get(i + 1);
            int liczba2 = Integer.parseInt(binarna2, 2);
            int roznica = Math.abs(liczba1 - liczba2);
            if (roznica > najwiekszaRoznica) {
                najwiekszaRoznica = roznica;
            }
        }
        System.out.println(Integer.toString(najwiekszaRoznica, 2));
    }
}
