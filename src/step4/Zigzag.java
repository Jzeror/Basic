package step4;

public class Zigzag {
	public static void main(String[] args) {
		int[][] mtx=new int[5][5];
int k=0;
		for(int i=0; i<5;i++) {
			
			if(i==1||i==3) {
				
				for(int j=4; j>=0; j--) {
					k++;
					mtx[j][i]=k;
				}
				for(int j=0; j<5; j++) {
					System.out.print(mtx[j][i]);
				}
					
			}else {
			
			
	for(int j=0; j<5; j++) {
		k++;
		System.out.print(k);
	}}
			System.out.println();
}
		
	}
}
