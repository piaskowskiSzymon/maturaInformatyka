import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad2_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/symbole.txt"));
        List<String> wiersze = new ArrayList<>();
        while (sc.hasNextLine()) {
            String linia = sc.nextLine();
            wiersze.add(linia);
        }
        sc.close();
        int liczbaKwadratow = 0;
        List<int[]> pozycje = new ArrayList<>();
        for (int w = 1; w < wiersze.size() - 1; w++) {
            for (int k = 1; k < wiersze.get(w).length() - 1; k++) {
                char symbol = wiersze.get(w).charAt(k);
                boolean kwadrat = true;

                for (int dw = -1; dw <= 1; dw++) {
                    for (int dk = -1; dk <= 1; dk++) {
                        if (wiersze.get(w + dw).charAt(k + dk) != symbol) {
                            kwadrat = false;
                        }
                    }
                }

                if (kwadrat) {
                    liczbaKwadratow++;
                    pozycje.add(new int[]{w + 1, k + 1});
                }
            }
        }
        System.out.println(liczbaKwadratow);
        for (int i = 0; i < pozycje.size(); i++) {
            int[] pozycja = pozycje.get(i);
            System.out.println(pozycja[0] + " " + pozycja[1]);
        }
    }
}
