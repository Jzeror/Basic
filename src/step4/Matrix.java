package step4;

import java.util.Scanner;

import javax.swing.JOptionPane;

enum Butt {
	EXIT, LEFT_TRIANGLE, RIGHT_TRIANGLE, ZIGZAG, DIAMOND, SAND_GLASS, TRIANGLE, DIAGONAL, SNAIL, MAGIC_SQUARE;
}

public class Matrix {
	public static void main(String[] args) {
		Butt[] buttons = { Butt.EXIT, Butt.LEFT_TRIANGLE, Butt.RIGHT_TRIANGLE, Butt.ZIGZAG, Butt.DIAMOND,
				Butt.SAND_GLASS, Butt.TRIANGLE, Butt.DIAGONAL, Butt.SNAIL, Butt.MAGIC_SQUARE };
		while (true) {
			Butt select = (Butt) JOptionPane.showInputDialog(null, // frame
					"MATRIX PAGE", // frame title
					"SELECT MATRIX MENU", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1] // default
			);
			switch (select) {
			case EXIT:
				return;
			case LEFT_TRIANGLE:
				JOptionPane.showMessageDialog(null, leftTriangle());
				break;
			case RIGHT_TRIANGLE:
				JOptionPane.showMessageDialog(null, rightTriangle());
				break;
			case ZIGZAG:
				break;
			case DIAMOND:
				JOptionPane.showMessageDialog(null, diamond());
				break;
			case SAND_GLASS:
				JOptionPane.showMessageDialog(null, sandGlass());
				break;
			case SNAIL:
				JOptionPane.showMessageDialog(null, snail());
				break;
			case DIAGONAL:
				JOptionPane.showMessageDialog(null, diagonal());
				break;
			case MAGIC_SQUARE:
				JOptionPane.showMessageDialog(null, magicSquare());
				break;
			case TRIANGLE:
				JOptionPane.showMessageDialog(null, triangle());
				break;
			default:
				break;
			}

		}

	
	}

	public static String leftTriangle() {
		int k = 0;
		String result = "";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				k++;
				result += k;
			}
			result += "\n";
		}
		return result;
	}

	public static String rightTriangle() {
		int k = 0;
		int[][] mtx = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 4 - i; j <= 4; j++) {
				k++;
				mtx[i][j] = k;

			}
			System.out.println();
		}
		String result = "";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += String.valueOf(mtx[i][j]) + "/";
			}
			result += "\n";
		}
		return result;
	}

	public static String zigzag() {
		int[][] mtx = new int[5][5];
		int k = 0;
		for (int i = 0; i < 5; i++) {
			if (i == 1 || i == 3) {
				for (int j = 4; j >= 0; j--) {
					k++;
					mtx[j][i] = k;
				}
				for (int j = 0; j < 5; j++) {
					System.out.print(mtx[j][i]);
				}
			}}
				String result = "";
				for (int e = 0; e < 5; e++) {
					for (int w = 0; w < 5; w++) {
						result += String.valueOf(mtx[e][w]) + "/";
					}
					result += "\n";
				}return result;
		
	}

	public static String diamond() {
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
		String result = "";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += String.valueOf(mtx[i][j]) + "/";
			}
			result += "\n";
		}
		return result;
	}

	public static String sandGlass() {
		int k = 0;
		int[][] mtx = new int[5][5];
		for (int i = 0; i < 5; i++) {
			if (i == 0 || i == 1 || i == 2) {
				for (int j = i; j <= 4 - i; j++) {
					k++;
					mtx[i][j] = k;
				}
			} else {
				for (int j = 4 - i; j <= i; j++) {
					k++;
					mtx[i][j] = k;
				}
			}
		}
		String result = "";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += String.valueOf(mtx[i][j]) + "/";
			}
			result += "\n";
		}
		return result;
	}

	public static String triangle() {
		Scanner sc = new Scanner(System.in);
	
		int a =Integer.parseInt( JOptionPane.showInputDialog("몇 열?"));
		int k = 0;
		int[][] mtx = new int[2 * a - 1][a];
		for (int j = 0; j <= a - 1; j++) {
			for (int i = a - j - 1; i <= a + j - 1; i++) {
				k++;
				mtx[i][j] = k;
			}
		}
		String result = "";
		for (int i = 0; i < 2 * a - 1; i++) {
			for (int j = 0; j <= a - 1; j++) {
				result += String.valueOf(mtx[i][j]) + "/";
			}
			result += "\n";
		}
		return result;

	}

	public static String diagonal() {
		int[][] mtx = new int[5][5];
		int i = 0, j = 0, k = 0;
		for (int a = 0; a <= 8; a++) {
			if (a <= 4) {
				i = 0;
				j = a;
				for (int s = 0; s <= a; s++) {
					k++;
					mtx[i][j] = k;
					i++;
					j--;
				}
			} else {
				i = a - 4;
				j = 4;
				for (int t = 8 - a; t >= 0; t--) {
					k++;
					mtx[i][j] = k;
					i++;
					j--;
				}
			}
		}
		String result = "";
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				result += String.valueOf(mtx[i][j]) + "/";
			}
			result += "\n";
		}
		return result;
	}

	public static String magicSquare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("행렬~~?");
		int w = sc.nextInt();
		int[][] mtx = new int[5][5];
		int a = 1, b = 1, k = 0;
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				k++;
				a = a - 1;
				b = b + 1;
				if (a < 0) {
					a = 4;
				}
				if (b > 4) {
					b = 0;
				}
				mtx[a][b] = k;
			}
			a = a + 2;
			b = b - 1;
		}
		String result = "";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += String.valueOf(mtx[i][j]) + "/";
			}
			result += "\n";
		}
		return result;
	}

	public static String snail() {
		int[][] mtx = new int[5][5];
		int i = 0, j = -1, k = 0, jj = 1;
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 5 - a; b++) {
				k++;
				j = j + jj;
				mtx[i][j] = k;
			}
			for (int c = 0; c < 4 - a; c++) {
				k++;
				i = i + jj;
				mtx[i][j] = k;
			}
			jj = (-1) * jj;
		}
		String result = "";
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				result += String.valueOf(mtx[i][j]) + "/";
			}
			result += "\n";
		}
		return result;
	}
}
