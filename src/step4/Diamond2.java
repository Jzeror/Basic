package step4;

public class Diamond2 {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k = 0;
		int a = 2, b = 2; int count=0;
		for (int i = 0; i< 5; i++) {
			count++;
			for (int j = a; j <= b; j++) {
				k++;
				System.out.println("회전"+count);
				System.out.println("i:"+i);
				System.out.println("j:"+j);
				System.out.println("a:"+a);
				System.out.println("b:"+b);
				mtx[i][j] = k;
			}
			if (i < 2) {
				a--;
				b++;
			}else {
				a++;
				b--;
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
