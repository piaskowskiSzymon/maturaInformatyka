public class Zad1_3 {
    public static void main(String[] args) {
        System.out.println(iloczyn(9, 11));
        System.out.println(iloczyn(8, 32));
        System.out.println(iloczyn(2, 47));
        System.out.println(iloczyn(112, 112));
    }

    public static int iloczyn(int x, int y) {
        int z = 0;
        while (y >= 1) {
            if (y % 2 == 1) {
                z = z + x;
            }
            x = x + x;
            y /= 2;
        }
        return z;
    }
}
