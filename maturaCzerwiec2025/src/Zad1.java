public class Zad1 {
    public static int licznik = 0;

    public static void main(String[] args) {
        //System.out.println(f(42, 2));
        //System.out.println(f(4, 125));
        //System.out.println(f(103, 104));
        //System.out.println(f(987654321, 123456789));
        //System.out.println(f(2024, 1000));
        System.out.println(f(2024, 1234));
        System.out.println(licznik);
    }

    public static int f(int a, int b) {

        if (b == 0) {
            return 0;
        }
        int k = ostatnia(b);
        int w = f(a, skroc(b));
        w = dopisz(w);
        while (k > 0) {
            licznik++;
            w = w + a;
            k--;
        }
        return w;
    }

    public static int skroc(int a) {
        return a / 10;
    }

    public static int dopisz(int a) {
        return a * 10;
    }

    public static int ostatnia(int a) {
        return a % 10;
    }
}
