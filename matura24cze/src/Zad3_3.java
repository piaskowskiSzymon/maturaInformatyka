import java.io.InputStream;
import java.util.Scanner;

public class Zad3_3 {
    public static void main(String[] args) {
        InputStream stream = Zad3_3.class.getClassLoader().getResourceAsStream("slowa.txt");
        Scanner sc = new Scanner(stream);
        while (sc.hasNextLine()){
            String slowo = sc.nextLine();
            String[] split = slowo.split("");

            for (int i= 0; i<split.length; i++){
                int licznik = 1;
                for(int j=i+1; j<split.length; j++){
                    if(split[i].equals(split[j])){
                        licznik++;
                    }
                }
                if(split.length%2==0){
                    if(licznik>=(split.length/2)){
                        System.out.println("");
                        for(int k=0; k<split.length; k++){
                            System.out.print(split[k]);
                        }
                        break;
                    }
                }
                if(split.length%2==1){
                    if(licznik>=(split.length/2)+1){
                        System.out.println("");
                        for(int k=0; k<split.length; k++){
                            System.out.print(split[k]);
                        }
                        break;
                    }
                }

            }
        }
    }
}
