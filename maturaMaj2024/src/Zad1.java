public class Zad1 {
    public static void main(String[] args) {
        int n1 = 3;
        int m1 = 3;
        int[][] A1 = {
                {1, 1, 1},
                {0, 1, 0},
                {1, 1, 1}
        };
        System.out.println(algorytm(A1, n1, m1));
        int n2 = 5;
        int m2 = 3;
        int[][] A2 = {
                {1, 1, 1},
                {0, 0, 1},
                {1, 1, 1},
                {1, 0, 0},
                {1, 1, 1}
        };
        System.out.println(algorytm(A2, n2, m2));
        int n3 = 5;
        int m3 = 5;
        int[][] A3 = {
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 1, 0, 0, 1},
                {0, 1, 1, 1, 0},
                {0, 1, 0, 1, 1}
        };
        System.out.println(algorytm(A3, n3, m3));
    }

    public static boolean algorytm(int[][] A, int n, int m) {
        boolean[][] P = new boolean[n][m];
        P[1][1] = true;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (A[i][j] == 0) {
                    P[i][j] = false;
                } else {
                    if (i == 1 && j != 1) {
                        P[i][j] = P[i][j - 1];
                    }
                    if (i != 1 && j == 1) {
                        P[i][j] = P[i - 1][j];
                    }
                    if (i != 1 && j != 1) {
                        if (P[i - 1][j]) {
                            P[i][j] = P[i - 1][j];
                        } else if (P[i][j - 1]) {
                            P[i][j] = P[i][j - 1];
                        } else {
                            P[i][j] = false;
                        }
                    }
                }
            }
        }
        return P[n - 1][m - 1];
    }
}
