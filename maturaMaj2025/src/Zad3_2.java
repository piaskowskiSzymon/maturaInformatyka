import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zad3_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/dron.txt"));
        ArrayList<int[]> punkty = new ArrayList<>();
        int x = 0;
        int y = 0;
        while (sc.hasNextLine()) {
            String linia = sc.nextLine();
            String[] split = linia.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            x += a;
            y += b;
            punkty.add(new int[]{x, y});
        }
        sc.close();
        int iloscPunktowWKwadracie = 0;
        for (int i = 0; i < punkty.size(); i++) {
            int[] punkt = punkty.get(i);
            if (punkt[0] < 5000 && punkt[1] < 5000) {
                iloscPunktowWKwadracie++;
            }
        }
        System.out.println("ilosc punktów w kwadracie: " + iloscPunktowWKwadracie);
        for (int i = 0; i < punkty.size(); i++) {
            int[] punktI = punkty.get(i);
            for (int j = i + 1; j < punkty.size(); j++) {
                int[] punktJ = punkty.get(j);
                for (int k = j + 1; k < punkty.size(); k++) {
                    int[] punktK = punkty.get(k);
                    if ((punktK[0] + punktI[0]) / 2 == punktJ[0] && (punktK[1] + punktI[1]) / 2 == punktJ[1]) {
                        System.out.println("Oto punkty gdzie jeden jest środkiem: (" + punktI[0] + ", " + punktI[1] + "), (" + punktJ[0] + ", " + punktJ[1] +
                                "), (" + punktK[0] + ", " + punktK[1] + ")");
                    }
                }
            }
        }
    }
}
