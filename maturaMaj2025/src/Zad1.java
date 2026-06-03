public class Zad1 {
    public static int licznik = 0;

    public static void main(String[] args) {
        System.out.println(przestaw(316498));
        System.out.println(licznik);
        System.out.println(przestaw(43657688));
        System.out.println(licznik);
        System.out.println(przestaw(154005710));
        System.out.println(licznik);
        System.out.println(przestaw(998877665544321l));
        System.out.println(licznik);

    }

    public static long przestaw(long n) {
        licznik++;
        long r = n % 100;
        long a = r / 10;
        long b = r % 10;
        n = n / 100;
        long w = 0;
        if (n > 0) {
            w = a + 10 * b + 100 * przestaw(n);
        } else {
            if (a > 0) {
                w = a + 10 * b;
            } else {
                w = b;
            }
        }
        return w;
    }
}
