import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3_3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/slowa.txt"));
        while (sc.hasNextLine()) {
            String slowo = sc.nextLine();
            int[] tablicaWartosci = new int[26];
            for (char c : slowo.toCharArray()) {
                tablicaWartosci[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (tablicaWartosci[i] * 2 >= slowo.length()) {
                    System.out.println(slowo);
                    break;
                }
            }
        }
        sc.close();
    }
}
