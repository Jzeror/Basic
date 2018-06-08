package step4;
import java.util.Scanner;

public class MatrixConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("행?");		
		int a = sc.nextInt();
		System.out.println("열?");
		int b = sc.nextInt();
		int[][] nmtx = new int[a][b], mmtx= new int[b][a];
		int k = 0;
		for (int i = 0; i <= a - 1; i++) {
			for (int j = 0; j <= b - 1; j++) {
				k++;
				nmtx[i][j] = k;
			}
		}
		k=0;
		for (int i = 0; i <= b - 1; i++) {
			for (int j = 0; j <= a - 1; j++) {
				k++;                                    
				mmtx[i][j] = k;
			}
		}
		for (int i = 0; i <= a - 1; i++) {
			for (int j = 0; j <= b - 1; j++) {
				System.out.print(nmtx[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---변 투더 환 ----");
		for (int i = 0; i <= b - 1; i++) {
			for (int j = 0; j <= a - 1; j++) {
				System.out.print(mmtx[i][j] + " ");
			}
			System.out.println();
		}
	}
}
