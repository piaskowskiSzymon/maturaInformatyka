import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3_2 {
    public static void main(String[] args) {
        InputStream stream = Zad3_1.class.getClassLoader().getResourceAsStream("dane.txt");
        Scanner sc = new Scanner(stream);
        String linia = sc.nextLine();
        String[] split = linia.split("");
        List<Integer> cyfry = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cyfry.add(0);
        }
        for (int i = 0; i < split.length; i++) {
            int numer = -1;
            try {
                numer = Integer.parseInt(split[i]);
            } catch (NumberFormatException exception) {
            }
            for (int j = 0; j < cyfry.size(); j++) {
                if (numer == j) {
                    cyfry.set(j, cyfry.get(j) + 1);
                }
            }
        }
        int max = -1;
        for (int i = 0; i < cyfry.size(); i++) {
            if (cyfry.get(i) > max) {
                max = cyfry.get(i);
            }
        }
        for (int i = 0; i < cyfry.size(); i++) {
            if (cyfry.get(i) == max) {
                System.out.println(i + " " + cyfry.get(i));
            }
        }

    }
}
