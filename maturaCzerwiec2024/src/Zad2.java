public class Zad2 {
    public static int licznik = 0;

    public static void main(String[] args) {
        //System.out.println(f(3));
        //System.out.println(licznik);
        //System.out.println(f(16));
        //System.out.println(licznik);
        //System.out.println(f(35));
        //System.out.println(licznik);
        System.out.println(f(256));
        System.out.println(f(511));
    }

    public static int f(int x) {
        licznik++;
        if (x == 0) {
            return 0;
        } else {
            return 2 + f(x / 2);
        }
    }
}
