package step4;

public class Snail {
    public static void main(String[] args) {
                    int[][] mtx = new int[5][5];
                    int i = 0, j = -1, k = 0, jj = 1;
                    for (int a = 0; a < 5; a++) {
                                    for (int b = 0; b < 5 - a; b++) {
                                                    k++;
                                                    j = j + jj;
                                                    mtx[i][j] = k;
                                                    }
                                    for (int c = 0; c < 4 - a; c++) {
                                                    k++;
                                                    i = i + jj;
                                                    mtx[i][j] = k;
                                    }
                                    jj = (-1) * jj;
                    }
                    for (i = 0; i < 5; i++) {
                                    for (j = 0; j < 5; j++) {
                                                    System.out.print(mtx[i][j]+" ");
                                    }
                                    System.out.println();
                    }
    }

}

