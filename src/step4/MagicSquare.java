package step4;
import java.util.Scanner;

public class MagicSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("행렬~~?");
		int w= sc.nextInt();
		int[][] mtx = new int[w][w];
		int a = 1, b = 1, k = 0;
		for (int j = 0; j < w; j++) {
			for (int i = 0; i < w; i++) {
				k++;
				a = a - 1;
				b = b + 1;
				if (a < 0) {
					a = w-1;
				}
				if (b > w-1) {
					b = 0;
				}
				mtx[a][b] = k;
			}
			a = a + 2;
			b = b - 1;
		}
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(mtx[i][j] + " ");
			}
			System.out.println();
		}
	}
}
