import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad4_3 {
    public static void main(String[] args) {
        InputStream stream = Zad4_3.class.getClassLoader().getResourceAsStream("odbiorcy.txt");
        Scanner sc = new Scanner(stream);
        int liczydlo = 1;
        List<Integer> poczatek =  new ArrayList<>();
        int z = 0;
        List<Integer> komputery = new ArrayList<>();
        while (sc.hasNextLine()){
            z++;
            komputery.add(z);
            poczatek.add(Integer.parseInt(sc.nextLine()));
        }
        List<Integer> wysylanie = new ArrayList<>();
        for(int i=0; i<poczatek.size(); i++){
            wysylanie.add(poczatek.get(i));
        }
        boolean czydziaa= false;
        while(!czydziaa){
            for(int i = 0; i<komputery.size(); i++){
                if(komputery.get(i)==wysylanie.get(i)){
                    System.out.println(liczydlo);
                    System.out.println(komputery.get(i));
                    czydziaa = true;
                    break;
                }
            }
            if(czydziaa==false){
                no(poczatek, wysylanie);
                liczydlo++;
            }
        }


    }

    private static void no(List<Integer> poczatek, List<Integer> wysylanie) {
        for(int i = 0; i< poczatek.size(); i++) {
            int k = wysylanie.get(i);
            wysylanie.set(i, poczatek.get(k-1));
        }
    }
}
