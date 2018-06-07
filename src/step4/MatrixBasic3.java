package step4;
//우에서 좌로
public class MatrixBasic3 {
	public static void main(String[] args) {
		int k= 0;
		int[][] mtx = new int[5][5];
		for(int j=4; j>=0;j--) {
			
			for(int i=0; i<=4;i++) {
				k++;
				mtx[i][j]=k;
				
			}}
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print(mtx[i][j]+"");
			}
			System.out.println();
		}
			}
		
	}


