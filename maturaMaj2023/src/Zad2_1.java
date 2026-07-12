public class Zad2_1 {
    public static void main(String[] args) {
        System.out.println(ileBlokow(67));
        System.out.println(ileBlokow(245));
    }

    public static int ileBlokow(int n) {
        int b = 1;
        int poprzednia = n % 2;
        n /= 2;
        while (n > 0) {
            int cyfra = n % 2;
            if (cyfra != poprzednia) {
                b++;
                poprzednia = cyfra;
            }
            n /= 2;
        }
        return b;
    }
}
