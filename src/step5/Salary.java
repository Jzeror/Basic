package step5;

import javax.swing.JOptionPane;
import step5.Butt;
enum Butt {
	EXIT, INPUT, LIST;
}
public class Salary {
	public static void main(String[] args) {
		String[] arr = new String[4];
		String[] result = new String[4];
		String[] w= {"부서","성명","급여","수당"};
		int i = 0;
		Butt[] buttons = { Butt.EXIT, Butt.INPUT, Butt.LIST };
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
			case INPUT:
				for(int e=0; e<=3;e++) {
				arr[e]=JOptionPane.showInputDialog(w[e]);
				}
				result[i] = arr[0] + " / " + arr[1] + " / " + arr[2] + " / " + arr[3] + " / "
						+ String.valueOf(Integer.parseInt(arr[2]) + Integer.parseInt(arr[3]));
				i++;
				break;
			case LIST:
				JOptionPane.showMessageDialog(null, "부서 / 이름 / 본봉 / 수당 / 합계\n" + result[0] + "\n" + result[1] + "\n"
						+ result[2] + "\n" + result[3]);
				break;
			default:
				break;
			}
		}
	}
}