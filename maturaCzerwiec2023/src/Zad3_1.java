import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3_1 {
    public static void main(String[] args) throws FileNotFoundException {
        int zrownowazone = 0;
        int prawieZrownowazone = 0;
        Scanner sc = new Scanner(new File("res/anagram.txt"));
        while (sc.hasNextLine()) {
            String linia = sc.nextLine();
            char[] znaki = linia.toCharArray();
            int iloscZer = 0;
            int iloscJedynek = 0;
            for (int i = 0; i < znaki.length; i++) {
                if (znaki[i] == '0') {
                    iloscZer++;
                } else if (znaki[i] == '1') {
                    iloscJedynek++;
                }
            }
            if (iloscZer == iloscJedynek) {
                zrownowazone++;
            }
            if (Math.abs(iloscZer - iloscJedynek) == 1) {
                prawieZrownowazone++;
            }
        }
        sc.close();
        System.out.println(zrownowazone);
        System.out.println(prawieZrownowazone);
    }
}
