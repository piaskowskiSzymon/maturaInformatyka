public class Zad2 {
    public static int licznik = 0;

    public static void main(String[] args) {
        //System.out.println(F(125, 2));
        //System.out.println(licznik);
        //System.out.println(F(130, 3));
        //System.out.println(licznik);
        //System.out.println(F(220,4));
        //System.out.println(licznik);
        System.out.println(F(96, 3));
        System.out.println(F(97, 4));
    }

    public static int F(int x, int p) {
        licznik++;
        if (x == 0) {
            return 0;
        } else {
            int c = x % p;
            if (c % 2 == 1) {
                return F(x / p, p) + c;
            } else {
                return F(x / p, p) - c;
            }
        }
    }
}
