public class Zad2_1 {
    public static int iloscPorownan = 0;

    public static void main(String[] args) {
        String slowo = "ababababb";
        char[] tablica = slowo.toCharArray();
        System.out.println(czyMniejszy(9, tablica, 1, 3));
        System.out.println(iloscPorownan);

    }

    public static boolean czyMniejszy(int n, char[] s, int k1, int k2) {
        int i = k1;
        int j = k2;
        while (i <= n && j <= n) {
            if (s[i] == s[j]) {
                iloscPorownan++;
                i++;
                j++;
            } else {
                if (s[i] < s[j]) {
                    iloscPorownan++;
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
