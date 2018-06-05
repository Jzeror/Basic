package step3;
import javax.swing.JOptionPane;

public class Starbucks4 {
	public static int totalPrice(String what, String count) {
		String[] price = { "3000", "3500", "4000" };
		return Integer.parseInt(price[Integer.parseInt(what) - 1]) * Integer.parseInt(count);
	}
	public static void main(String[] args) {
		int sum = 0;
		while (true) {
			String what = JOptionPane.showInputDialog("0.주문완료\n" + "1.아메리카노" + "2.카페라떼" + "3.바닐라라떼");
			switch (what) {
			case "0":
				JOptionPane.showMessageDialog(null, sum + "원입니다");
				sum = 0;
				break;
			case "1":	case "2":	case "3":				
				sum += totalPrice(what, JOptionPane.showInputDialog("몇개?"));
				JOptionPane.showMessageDialog(null, sum);
				break;
			}
		}
	}
} 