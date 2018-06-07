package step4;


import java.util.Scanner;
public class MatrixConversion {
                
                public static void main(String[] args) {
                                Scanner sc=new Scanner(System.in);
                                int a=sc.nextInt();
                                int b=sc.nextInt();
                                int[][] nmtx = new int[a][b];
                                int k = 0;
                                for (int j = 0; j <= a-1; j++) {
                                                for (int i = 0; i <= b-1; i++) {
                                                                k++;
                                                                nmtx[j][i] = k;
                                                }
                                }
                                for (int i = 0; i <= a-1; i++) {
                                                for (int j = 0; j <= b-1; j++) {
                                                                System.out.print(nmtx[i][j]+" ");
                                                }
                                                System.out.println();
                                }
                }

}








