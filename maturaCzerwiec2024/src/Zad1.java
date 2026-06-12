public class Zad1 {
    public static void main(String[] args) {
        System.out.println(funkcja(5, 3, 19));
        System.out.println(funkcja(4, 5, 179));
    }

    public static int funkcja(int w, int k, int n) {
        int dlugosc = 0;
        int pomocnicza = n;
        while (pomocnicza > 0) {
            pomocnicza /= 2;
            dlugosc++;
        }
        if ((w * k) % dlugosc != 0) {
            for (int i = 0; i < (w * k) % dlugosc; i++) {
                n /= 2;
            }
        }
        int x = n % 2;
        return x;
    }
}
