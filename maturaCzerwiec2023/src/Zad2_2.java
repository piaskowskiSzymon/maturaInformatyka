import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2_2 {
    public static void main(String[] args) throws FileNotFoundException {
        /*Scanner sufiks1 = new Scanner(new File("res/sufiks_1.txt"));
        int dlugosc1 = sufiks1.nextInt();
        sufiks1.nextLine();
        String slowo1 = sufiks1.nextLine();
        char[] tablicaSlowa1 = slowo1.toCharArray();
        int k1_1 = sufiks1.nextInt();
        int k2_1 = sufiks1.nextInt();
        boolean wynik1 = czyMniejszy(dlugosc1, tablicaSlowa1, k1_1, k2_1);
        if (wynik1){
            System.out.println("TAK");
        }else {
            System.out.println("NIE");
        }
        Scanner sufiks2 = new Scanner(new File("res/sufiks_2.txt"));
        int dlugosc2 = sufiks2.nextInt();
        sufiks2.nextLine();
        String slowo2 = sufiks2.nextLine();
        char[] tablicaSlowa2 = slowo2.toCharArray();
        int k1_2 = sufiks2.nextInt();
        int k2_2 = sufiks2.nextInt();
        boolean wynik2 =  czyMniejszy(dlugosc2, tablicaSlowa2, k1_2, k2_2);
        if (wynik2){
            System.out.println("TAK");
        }else {
            System.out.println("NIE");
        } */
        Scanner slowa1 = new Scanner(new File("res/slowa1.txt"));
        int dlugosc3 = slowa1.nextInt();
        slowa1.nextLine();
        String slowo3 = slowa1.nextLine();
        char[] tablicaSlowa3 = slowo3.toCharArray();
        int k1_3 = slowa1.nextInt();
        int k2_3 = slowa1.nextInt();
        boolean wynik3 = czyMniejszy(dlugosc3, tablicaSlowa3, k1_3, k2_3);
        if (wynik3) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
        Scanner slowa2 = new Scanner(new File("res/slowa2.txt"));
        int dlugosc4 = slowa2.nextInt();
        slowa2.nextLine();
        String slowo4 = slowa2.nextLine();
        char[] tablicaSlowa4 = slowo4.toCharArray();
        int k1_4 = slowa2.nextInt();
        int k2_4 = slowa2.nextInt();
        boolean wynik4 = czyMniejszy(dlugosc4, tablicaSlowa4, k1_4, k2_4);
        if (wynik4) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
        Scanner slowa3 = new Scanner(new File("res/slowa3.txt"));
        int dlugosc5 = slowa3.nextInt();
        slowa3.nextLine();
        String slowo5 = slowa3.nextLine();
        char[] tablicaSlowa5 = slowo5.toCharArray();
        int k1_5 = slowa3.nextInt();
        int k2_5 = slowa3.nextInt();
        boolean wynik5 = czyMniejszy(dlugosc5, tablicaSlowa5, k1_5, k2_5);
        if (wynik5) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

    public static boolean czyMniejszy(int n, char[] s, int k1, int k2) {
        int i = k1;
        int j = k2;
        while (i < n && j < n) {
            if (s[i] == s[j]) {
                i++;
                j++;
            } else {
                if (s[i] < s[j]) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        if (j <= n) {
            return true;
        } else {
            return false;
        }
    }
}
