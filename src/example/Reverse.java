package example;
import javax.swing.JOptionPane;
public class Reverse {
	public static void main(String[] args) {
		String result = "";
		String input = JOptionPane.showInputDialog("글자 입력");
		for (int i = input.length() - 1; i >= 0; i--) {
			result += input.charAt(i);
		}
		JOptionPane.showMessageDialog(null, result);
	}
}
