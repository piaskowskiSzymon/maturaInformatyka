public class Zad3_1 {
    public static void main(String[] args) {
        System.out.println(nieparzystySkrot(294762));
        System.out.println(nieparzystySkrot(39101));
    }

    public static int nieparzystySkrot(int n) {
        int m = 0;
        int p = 1;
        while (n > 0) {
            int cyfra = n % 10;
            if (cyfra % 2 != 0) {
                m += cyfra * p;
                p *= 10;
            }
            n /= 10;
        }
        return m;
    }
}
