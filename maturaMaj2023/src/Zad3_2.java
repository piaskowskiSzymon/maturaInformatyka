import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3_2 {
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
        int[] liczby = new int[100];
        for (int i = 0; i < 100; i++) {
            for (int j : fragmenty) {
                if (j == i) {
                    liczby[i]++;
                }
            }
        }
        int indexNajwiekszej = -1;
        int najwieksza = 0;
        int indexNajmniejszej = -1;
        int najmniejsza = 10000;
        for (int i = 0; i < 100; i++) {
            if (liczby[i] > najwieksza) {
                najwieksza = liczby[i];
                indexNajwiekszej = i;
            }
            if (liczby[i] < najmniejsza) {
                najmniejsza = liczby[i];
                indexNajmniejszej = i;
            }
        }
        System.out.println("Fragment: " + indexNajmniejszej + " Liczba wystąpień: " + najmniejsza);
        System.out.println("Fragment: " + indexNajwiekszej + " Liczba wystąpień: " + najwieksza);
        sc.close();
    }
}
