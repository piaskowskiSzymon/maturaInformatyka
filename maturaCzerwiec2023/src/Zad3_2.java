import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3_2 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("res/anagram.txt"));
        while (sc.hasNextLine()) {
            String linia = sc.nextLine();
            char[] znaki = linia.toCharArray();
            int iloscZer = 0;
            int iloscJedynek = 0;
            if (znaki.length == 8) {
                for (int i = 0; i < znaki.length; i++) {
                    if (znaki[i] == '0') {
                        iloscZer++;
                    } else if (znaki[i] == '1') {
                        iloscJedynek++;
                    }
                }
                if (iloscJedynek == iloscZer) {
                    System.out.println(linia);
                }
                if (iloscJedynek - iloscZer == 2) {
                    System.out.println(linia);
                }
            }

        }
        sc.close();
    }
}
