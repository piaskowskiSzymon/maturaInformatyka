public class Zad1_3 {
    public static int licznik = 0;

    public static void main(String[] args) {
        System.out.println(przestaw2(316498));
        System.out.println(licznik);
        System.out.println(przestaw2(43657688));
        System.out.println(licznik);
        System.out.println(przestaw2(154005710));
        System.out.println(licznik);
        System.out.println(przestaw2(998877665544321l));
        System.out.println(licznik);
    }

    public static long przestaw2(long n) {
        long w = 0;
        long p = 1;
        while (n > 0) {
            licznik++;
            long r = n % 100;
            long a = r / 10;
            long b = r % 10;
            if (n > 9) {
                w = p * a + 10 * p * b + w;
            } else {
                w = p * b + w;
            }
            n = n / 100;
            p = p * 100;
        }
        return w;
    }
}
