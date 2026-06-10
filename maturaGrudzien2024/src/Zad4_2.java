import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad4_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/prostokaty.txt"));
        List<Integer> wysokosci = new ArrayList<>();
        List<Integer> szerokosci = new ArrayList<>();
        while (sc.hasNextLine()) {
            String linia = sc.nextLine();
            String[] split = linia.split(" ");
            int wysokosc = Integer.parseInt(split[0]);
            wysokosci.add(wysokosc);
            int szerokosc = Integer.parseInt(split[1]);
            szerokosci.add(szerokosc);
        }
        sc.close();
        int najdluzszaSeria = 1;
        int koniecSerii = 0;
        int obecnaSeria = 1;
        for (int i = 1; i < wysokosci.size(); i++) {
            if (szerokosci.get(i) <= szerokosci.get(i - 1) && wysokosci.get(i) <= wysokosci.get(i - 1)) {
                obecnaSeria++;
            } else {
                obecnaSeria = 1;
            }
            if (obecnaSeria > najdluzszaSeria) {
                najdluzszaSeria = obecnaSeria;
                koniecSerii = i;
            }
        }
        System.out.println("Ciąg ma długość: " + najdluzszaSeria);
        System.out.println("wysokość ostatniego prostokąta: " + wysokosci.get(koniecSerii) + " i szerokość: " + szerokosci.get(koniecSerii));
    }
}
