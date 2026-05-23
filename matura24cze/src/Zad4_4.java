import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad4_4 {
    public static void main(String[] args) {
        InputStream stream = Zad4_4.class.getClassLoader().getResourceAsStream("odbiorcy_przyklad.txt");
        Scanner sc= new Scanner(stream);
        List<Integer> poczatek = new ArrayList<>();
        List<Integer> licznik = new ArrayList<>();
        while (sc.hasNextLine()){
            licznik.add(0);
            poczatek.add(Integer.parseInt(sc.nextLine()));
        }
        List<Integer> wysylanie = new ArrayList<>();
        for(int i = 0; i<poczatek.size(); i++){
            wysylanie.add(i);
        }
        no(poczatek, wysylanie);
        for(int i = 0; i<wysylanie.size()-2; i++){
            int k = wysylanie.get(i);
            licznik.set(k-1, licznik.get(k)+1);
        }
        int najwieksza=0;
        int najwiekszyIndex=0;
        for(int i=0; i<licznik.size(); i++){
            if(licznik.get(i)>najwieksza){
                najwieksza=licznik.get(i);
                najwiekszyIndex=i;
            }
        }
        System.out.println(najwieksza);
        no(poczatek, wysylanie);
        for(int i = 0; i<wysylanie.size()-2; i++){
            int k = wysylanie.get(i);
            licznik.set(k-1, licznik.get(k)+1);
        }
        najwieksza=0;
        najwiekszyIndex=0;
        for(int i=0; i<licznik.size(); i++){
            if(licznik.get(i)>najwieksza){
                najwieksza=licznik.get(i);
                najwiekszyIndex=i;
            }
        }
        System.out.println(najwieksza);
    }
    private static void no(List<Integer> poczatek, List<Integer> wysylanie) {
        for(int i = 0; i< poczatek.size(); i++) {
            int k = wysylanie.get(i);
            wysylanie.set(i, poczatek.get(k));
        }
    }
}
