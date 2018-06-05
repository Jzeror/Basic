package step3;

/**
 가위바위보
 * */
import javax.swing.JOptionPane;

public class RPSGame {
	public static void main(String[] args) {
		int win = 0, lose = 0, draw = 0, play = 0;
		int b = 0;
		int c = Integer.parseInt(JOptionPane.showInputDialog("몇판?"));
		for (int i = 0; i < c; i++) {

			int a = Integer.parseInt(JOptionPane.showInputDialog("플레이어1 주(1), 보(2), 가(3) "));

			for (int j = 1; j <= 2; j++) {
				b = (int) (Math.random() * 10);
				if (b != 1 && b != 2 && b != 3) {
					j--;
				}
			}
			switch ((a - b - 1) % 3) {
			case 0:
				JOptionPane.showMessageDialog(null, "승리");
				win = win + 1;
				play = play + 1;
				break;
			case -1:
				JOptionPane.showMessageDialog(null, "무승부");
				draw = draw + 1;
				play = play + 1;
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "패배");
				lose = lose + 1;
				play = play + 1;
				break;
			case -2:
				JOptionPane.showMessageDialog(null, "패배");
				lose = lose + 1;
				play = play + 1;
				break;

			}
			JOptionPane.showMessageDialog(null, "플레이:" + play + " 승리:" + win + " 무승부:" + draw + " 패배:" + lose);

		}

	}
}

