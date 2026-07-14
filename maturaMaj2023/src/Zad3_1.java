import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/pi.txt"));
        List<Integer> lista = new ArrayList<>();
        while (sc.hasNextInt()) {
            lista.add(sc.nextInt());
        }
        List<Integer> fragmenty = new ArrayList<>();
        for (int i = 0; i < 9999; i++) {
            int liczba = lista.get(i) * 10 + lista.get(i + 1);
            fragmenty.add(liczba);
        }
        int iloscWiekszychNiz90 = 0;
        for (int i : fragmenty) {
            if (i > 90) {
                iloscWiekszychNiz90++;
            }
        }
        System.out.println(iloscWiekszychNiz90);
        sc.close();
    }
}
