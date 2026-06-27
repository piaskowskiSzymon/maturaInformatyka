public class Zad2 {
    public static int licznik = 0;
    public static void main(String[] args) {
        System.out.println(obliczLiczbeC(33658));
        System.out.println(licznik);
        licznik=0;
        System.out.println(obliczLiczbeC(542102 ));
        System.out.println(licznik);
        licznik=0;
        System.out.println(obliczLiczbeC(87654321012345678l));
        System.out.println(licznik);
        licznik=0;
        System.out.println(obliczLiczbeC(333333666666999999l));
    }

    public static long obliczLiczbeC(long n) {
        long c = 0;
        long b = 1;
        while (n > 0) {
            long a = n % 10;
            n = n / 10;
            if (a % 2 == 0) {
                c += b * (a / 2);
            } else {
                licznik++;
                c += b;
            }
            b = b * 10;
        }
        return c;
    }
}
