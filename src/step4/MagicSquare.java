package step4;


public class MagicSquare {
                public static void main(String[] args) {
                                int[][] mtx = new int[5][5];
                                int a = 1, b = 1, k = 0;
                                for (int j = 4; j >= 0; j--) {
                                                for (int i = 0; i <= 4; i++) {
                                                                k++;
                                                                a = a - 1;
                                                                b = b + 1;
                                                                if (a < 0) {
                                                                                a = 4;
                                                                }
                                                                if (b > 4) {
                                                                                b = 0;
                                                                }
                                                                mtx[a][b] = k;
                                                }
                                                a = a + 2;
                                                b = b - 1;
                                                if (b > 4) {
                                                                b = 0;
                                                }
                                                if (a < 0) {
                                                                a = 4;
                                                }
                                }
                                for (int i = 0; i < 5; i++) {
                                                for (int j = 0; j < 5; j++) {
                                                                System.out.print(mtx[i][j] + "  ");
                                                }
                                                System.out.println();
                                }
                }

}







