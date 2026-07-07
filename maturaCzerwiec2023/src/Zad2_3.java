import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Zad2_3 {
    public static void main(String[] args) {
        String tekst1 = "mascarpone";
        String tekst2 = "kalafiorowa";
        char[] s1 = tekst1.toCharArray();
        char[] s2 = tekst2.toCharArray();
        int[] alfabetycznie1 = alfabetycznie(10, s1);
        int[] alfabetycznie2 = alfabetycznie(11, s2);
        for (int i = 0; i<alfabetycznie1.length; i++){
            System.out.print(alfabetycznie1[i]);
        }
        System.out.println("---------------------");
        for (int i = 0; i<alfabetycznie2.length; i++){
            System.out.print(alfabetycznie2[i] + ", ");
        }
    }

    public static int[] alfabetycznie(int n, char[] s) {
        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            T[i] = i;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i; j++) {
                if (!czyMniejszy(n, s, i, i + 1)) {
                    int x = T[i + 1];
                    T[i + 1] = T[i];
                    T[i] = x;
                }
            }
        }
        return T;
    }

    public static boolean czyMniejszy(int n, char[] s, int k1, int k2) {
        int i = k1;
        int j = k2;
        while (i <= n && j <= n) {
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
