import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3_4 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("res/anagram.txt"));
        List<String> dziesietne = new ArrayList<>();
        while (sc.hasNextLine()) {
            String linia = sc.nextLine();
            int liczba = Integer.parseInt(linia, 2);
            String liczbaWStringu = Integer.toString(liczba);
            dziesietne.add(liczbaWStringu);
        }
        sc.close();
        int liczbyBez0 = 0;
        int najwyzszaSumaRoznychcyfr = 0;
        String liczbaZNajwyzszaSuma = "";
        for (int i = 0; i < dziesietne.size(); i++) {
            String liczba = dziesietne.get(i);
            char[] cyfry = liczba.toCharArray();
            boolean czyWystepuje0 = false;
            for (int j = 0; j < cyfry.length; j++) {
                if (cyfry[j] == '0') {
                    czyWystepuje0 = true;
                    break;
                }
            }
            if (!czyWystepuje0) {
                liczbyBez0++;
            }
            int sumaRoznychcyfr = 0;
            for (int j = 1; j < 10; j++) {
                for (int k = 0; k < cyfry.length; k++) {
                    int cyfra = Integer.parseInt(String.valueOf(cyfry[k]));
                    if (cyfra == j) {
                        sumaRoznychcyfr += j;
                        break;
                    }
                }
            }
            if (sumaRoznychcyfr > najwyzszaSumaRoznychcyfr) {
                najwyzszaSumaRoznychcyfr = sumaRoznychcyfr;
                liczbaZNajwyzszaSuma = liczba;
            }
        }
        System.out.println(liczbyBez0);
        System.out.println(liczbaZNajwyzszaSuma);
    }
}
