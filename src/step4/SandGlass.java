package step4;

public class SandGlass {
	public static void main(String[] args) {
		int k = 0;
		int[][] mtx=new int[5][5];
	for(int i=0; i<5; i++) {
		if(i==0 || i==1 ||i ==2){
					for(int j=i; j<=4-i;j++) {
						k++;
						mtx[i][j]=k;
		}
		}else {
			for(int j=4-i; j<=i;j++) {
				k++;
				mtx[i][j]=k;
		}
	}
	}
	for(int i=0; i<5; i++) {
		for(int j=0; j<5;j++) {
		System.out.print(mtx[i][j]);
		
		}System.out.println();
		
	}
}}
