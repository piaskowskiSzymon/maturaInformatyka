public class Zad2_1 {
    public static void main(String[] args) {
        int k = 120056;
        int dlugosc = 0;
        int x = k;
        while (x > 0) {
            x = x / 10;
            dlugosc++;
        }
        int potega = 1;
        int b = 0;
        for (int i = 1; i <= dlugosc / 2; i++) {
            b = b + (potega * (k % 10));
            k = k / 10;
            potega = potega * 10;
        }
        int a = k;
        System.out.println(a + " " + b);

    }
}
