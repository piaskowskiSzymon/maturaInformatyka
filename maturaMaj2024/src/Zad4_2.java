import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Zad4_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/liczby.txt"));
        List<Integer> liczbyPierwsze = new ArrayList<>();
        String linia = sc.nextLine();
        String[] split = linia.split(" ");
        for (int i = 0; i < split.length; i++) {
            int liczbaPierwsza = Integer.parseInt(split[i]);
            liczbyPierwsze.add(liczbaPierwsza);
        }
        liczbyPierwsze.sort(Collections.reverseOrder());
        System.out.println(liczbyPierwsze.get(100));
    }
}
