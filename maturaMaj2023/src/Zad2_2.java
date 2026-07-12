import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("res/bin.txt"));
        int liczbyZCoNajwyzej2Blokow = 0;
        while (sc.hasNextLine()) {
            String binarna = sc.nextLine();
            String[] split = binarna.split("");
            String poprzednia = split[0];
            int iloscBlokow = 1;
            for (int i = 1; i < split.length; i++) {
                if (!split[i].equals(poprzednia)) {
                    iloscBlokow++;
                    poprzednia = split[i];
                }
            }
            if (iloscBlokow <= 2) {
                liczbyZCoNajwyzej2Blokow++;
            }
        }
        sc.close();
        System.out.println(liczbyZCoNajwyzej2Blokow);
    }
}
