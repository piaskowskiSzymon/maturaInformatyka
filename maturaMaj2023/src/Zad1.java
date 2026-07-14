public class Zad1 {
    public static void main(String[] args) {
        int[][] tablica1 = new int[5][16];
        tablica1[0][1] = 9;
        tablica1[1][1] = 2;
        tablica1[1][2] = 12;
        tablica1[2][3] = 10;
        tablica1[2][4] = 14;
        tablica1[3][7] = 13;
        tablica1[3][8] = 15;
        wypisz(0, 1, tablica1);
        System.out.println("tablica 2");
        int[][] tablica2 = new int[5][16];
        tablica2[0][1] = 10;
        tablica2[1][1] = 8;
        tablica2[1][2] = 15;
        tablica2[2][1] = 4;
        tablica2[2][3] = 12;
        tablica2[3][2] = 6;
        tablica2[3][6] = 13;
        wypisz(0, 1, tablica2);
    }

    public static void wypisz(int i, int j, int[][] B) {
        try {
            System.out.println(B[i][j]);
            if (B[i + 1][2 * j - 1] != 0) {
                wypisz(i + 1, 2 * j - 1, B);
            }
            if (B[i + 1][2 * j] != 0) {
                wypisz(i + 1, 2 * j, B);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }
}
