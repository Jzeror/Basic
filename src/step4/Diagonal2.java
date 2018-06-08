package step4;

public class Diagonal2 {
	public static void main(String[] args) {
		int[][]mtx = new int[5][5];
		int k = 0, count = 9, row = 0;
		for(int i = 0; i < count; i++){
			for(int j = 0; j < 5; j++){
				row = i-j;
				if(0 <= row && row < 5){
					k++;
					mtx[j][row]=k;
				}
			}
		}
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.printf("%d. ", mtx[i][j]);
			}
			System.out.printf("\n");
		}
	}
}