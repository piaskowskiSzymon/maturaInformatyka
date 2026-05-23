import java.io.InputStream;
import java.util.Scanner;

public class Zad3_2 {
    public static void main(String[] args) {
        InputStream stream = Zad3_2.class.getClassLoader().getResourceAsStream("slowa.txt");
        Scanner sc = new Scanner(stream);
        int liczydlo = 0;
        int najdluzszy = 0;
        while (sc.hasNextLine()) {
            String slowo = sc.nextLine();
            String przesuwamy = slowo;
            String[] split = przesuwamy.split("");
            for (int i = 0; i < split.length; i++) {
                int index = split[i].codePointAt(0);
                index += 13;
                if (index > 122) {
                    index = index - 26;
                }
                char znak = (char) index;
                split[i] = "" + znak;
            }
            String[] przod = slowo.split("");
            int licznik = 0;

            for (int i = 0; i < przod.length; i++) {
                if (!przod[i].equals(split[split.length - i - 1])) {
                    break;
                }
                licznik++;
                if (licznik > najdluzszy) {
                    najdluzszy = licznik;
                }
            }
            if (licznik == split.length) {
                liczydlo++;
            }
            if(split.length==najdluzszy){
                System.out.println("");
                for(int i=0; i<przod.length; i++){
                    if (!przod[i].equals(split[split.length - i - 1])) {
                        break;
                    }
                    System.out.print(przod[i]);
                }
            }


        }
        System.out.println(liczydlo);
    }
}
