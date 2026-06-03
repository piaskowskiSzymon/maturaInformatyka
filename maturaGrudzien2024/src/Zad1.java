public class Zad1 {
    public static void main(String[] args) {
        J(19);
        System.out.println("");
        J(6);
        System.out.println("");
        J(42);

    }

    public static void J(int n) {
        int b = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                System.out.print(b + ",");
            }
            n /= 2;
            b++;
        }
    }
}
