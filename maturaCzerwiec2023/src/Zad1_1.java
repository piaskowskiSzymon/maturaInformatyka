public class Zad1_1 {
    public static int liczbaDodawan = 0;

    public static void main(String[] args) {
        System.out.println(iloczyn(10, 45));
        liczbaDodawan = 0;
        iloczyn(9,11);
        System.out.println(liczbaDodawan);
        liczbaDodawan = 0;
        iloczyn(8,32);
        System.out.println(liczbaDodawan);
        liczbaDodawan = 0;
        iloczyn(2,47);
        System.out.println(liczbaDodawan);
        liczbaDodawan = 0;
        iloczyn(112,112);
        System.out.println(liczbaDodawan);
    }

    public static int iloczyn(int x, int y) {
        if (y == 1) {
            return x;
        } else {
            int k = y / 2;
            int z = iloczyn(x, k);
            if (y % 2 == 0) {
                liczbaDodawan++;
                return z + z;

            } else {
                liczbaDodawan += 2;
                return x + z + z;
            }
        }

    }
}
