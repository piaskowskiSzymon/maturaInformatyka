import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3_3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/pi.txt"));
        int[] cyfry = new int[10000];
        int liczbaWczytanych = 0;
        while (sc.hasNextInt()) {
            cyfry[liczbaWczytanych++] = sc.nextInt();
        }
        int liczbaCiagow = 0;
        int[] okno = new int[6];
        for (int i = 0; i + 6 <= liczbaWczytanych; i++) {
            for (int j = 0; j < 6; j++) {
                okno[j] = cyfry[i + j];
            }
            if (jestRosnacoMalejacy(okno)) {
                liczbaCiagow++;
            }
        }
        System.out.println("Liczba rosnąco-malejących ciągów sześciu kolejnych cyfr: " + liczbaCiagow);
        sc.close();
    }

    private static boolean jestRosnacoMalejacy(int[] a) {
        int n = a.length;
        int m = 1;
        while (m < n && a[m - 1] < a[m]) {
            m++;
        }

        int k = m;
        if (k < 2 || k > n - 2) {
            return false;
        }
        for (int i = k - 1; i < n - 1; i++) {
            if (a[i] <= a[i + 1]) {
                return false;
            }
        }

        return true;
    }

}
