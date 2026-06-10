import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Zad4_3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/prostokaty.txt"));
        Map<Integer, List<Integer>> naWysokosc = new HashMap<>();
        while (sc.hasNextLine()) {
            String linia = sc.nextLine();
            String[] split = linia.split(" ");
            int wysokosc = Integer.parseInt(split[0]);
            int szerokosc = Integer.parseInt(split[1]);
            naWysokosc.computeIfAbsent(wysokosc, k -> new ArrayList<>()).add(szerokosc);
        }
        //System.out.println(naWysokosc);
        sc.close();
        int najlepszyZDwoch = 0;
        int najlepszyZTrzech = 0;
        int najlepszyZPieciu = 0;
        for (Map.Entry<Integer, List<Integer>> entry : naWysokosc.entrySet()) {
            List<Integer> szerokosci = entry.getValue();
            int count = szerokosci.size();
            szerokosci.sort(Collections.reverseOrder());
            if (count >= 2) {
                int suma = szerokosci.get(0) + szerokosci.get(1);
                if (suma > najlepszyZDwoch) {
                    najlepszyZDwoch = suma;
                }
            }
            if (count >= 3) {
                int suma = szerokosci.get(0) + szerokosci.get(1) + szerokosci.get(2);
                if (suma > najlepszyZTrzech) {
                    najlepszyZTrzech = suma;
                }
            }
            if (count >= 5) {
                int suma = szerokosci.get(0) + szerokosci.get(1) + szerokosci.get(2) + szerokosci.get(3) + szerokosci.get(4);
                if (suma > najlepszyZPieciu) {
                    najlepszyZPieciu = suma;
                }
            }
        }
        System.out.println("2 prostokąty: " + najlepszyZDwoch);
        System.out.println("3 prostokąty: " + najlepszyZTrzech);
        System.out.println("5 prostokątów: " + najlepszyZPieciu);
    }
}
