package step4;

public class Diamond {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k = 0;
		for (int i = 0; i < 5; i++) {
			if (i < 3) {
				for (int j = 2 - i; j <= 2 + i; j++) {
					k++;
					mtx[i][j] = k;
				}
			} else {
				for (int j = -2 + i; j <= 6 - i; j++) {
					k++;
					mtx[i][j] = k;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mtx[i][j] + " ");
			}
			System.out.println();
		}
	}
}
