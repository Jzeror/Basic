package step4;

public class Diagonal {
    public static void main(String[] args) {
                    int[][] mtx = new int[5][5];
                    int i = 0, j = 0, k = 0;
                    for (int a = 0; a <= 8; a++) {
                                    if (a <= 4) {
                                                    i = 0;
                                                    j = a;
                                                    for (int s = 0; s <= a; s++) {
                                                                    k++;
                                                                    mtx[i][j] = k;
                                                                    i++;
                                                                    j--;
                                                    }
                                    } else {
                                                    i = a - 4;
                                                    j = 4;
                                                    for (int t = 8-a; t >= 0; t--) {
                                                                    k++;
                                                                    mtx[i][j] = k;
                                                                    i++;
                                                                    j--;
                                                    }
                                    }
                    }
                    for (int y = 0; y <= 4; y++) {
                                    for (int u = 0; u <= 4; u++) {
                                                    System.out.print(mtx[y][u]+"  ");
                                    }
                                    System.out.println();
                    }
    }

}



