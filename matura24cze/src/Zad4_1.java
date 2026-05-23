import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad4_1 {
    public static void main(String[] args) {
        InputStream stream =Zad4_1.class.getClassLoader().getResourceAsStream("odbiorcy.txt");
        Scanner sc = new Scanner(stream);
        int licznik=0;
        List<Integer> odbiorcy = new ArrayList<Integer>();
        while (sc.hasNextLine()){
            int liczba = Integer.parseInt(sc.nextLine());
            odbiorcy.add(liczba);
            licznik++;
        }
        List<Integer> numery = new ArrayList<Integer>();
        for(int i= 0; i<licznik; i++){
            numery.add(i+1);
        }
        int liczydlo = 0;
        for(int i =0; i<numery.size(); i++){
            if(!odbiorcy.contains(numery.get(i))){
                liczydlo++;
            }
        }
        System.out.println(liczydlo);
    }


}
