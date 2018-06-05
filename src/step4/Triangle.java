package step4;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 배열?");
		int a = sc.nextInt();
		int k = 0;
		int[][] mtx = new int[2 * a+1][a];
		for (int j=0;j<=a-1;j++) {
			for (int i=a-j-1; i<=a+j-1;i++) {
				k++;
				mtx[i][j]=k;
			}
		}
		for (int i = 0; i < 2*a-1; i++) {
			for (int j =0; j <=a-1; j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println();
		}
	}
}
