import java.io.InputStream;
import java.util.Scanner;

public class Zad3_1 {
    public static void main(String[] args) {
        InputStream stream = Zad3_1.class.getClassLoader().getResourceAsStream("slowa.txt");
        Scanner sc = new Scanner(stream);
        int licznik=0;
        while (sc.hasNextLine()){
            String slowo = sc.nextLine();
            String[] split = slowo.split("");
            for(int i = 0; i<split.length-2; i++) {
                if (split[i].equals("k") && split[i + 2].equals("t")) {
                    licznik++;
                }
            }
        }
        System.out.println(licznik);
    }
}
