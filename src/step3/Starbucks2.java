package step3;

import javax.swing.JOptionPane;

public class Starbucks2 {
	public static void main(String[] args) {
		String count = "";
		int sum = 0;
		while (true) {
			String option = JOptionPane.showInputDialog("0.주문완료 \n" + "1.아메리카노3000\n" + "2.라떼3500\n" + "3.카푸치노4000\n");
			String result = "";
			switch (option) {
			case "0":
				if (sum > 0) {
					result = "총 결제 금액 " + sum + "입니다";
					sum = 0;
				} else {
					result = "이용해주셔서 감사합니다";
					return;
				}
				break;
			case "1":
				count = JOptionPane.showInputDialog("몇 잔 드릴까요?\n");
				sum += 3000 * Integer.parseInt(count);
				result = "주문 금액 : " + sum;
				break;
			case "2":
				count = JOptionPane.showInputDialog("몇 잔 드릴까요?\n");
				sum += 3500 * Integer.parseInt(count);
				result = "주문 금액 : " + sum;
				break;
			case "3":
				count = JOptionPane.showInputDialog("몇 잔 드릴까요?\n");
				sum += 4000 * Integer.parseInt(count);
				result = "주문 금액 : " + sum;
				break;
			default:
				break;
			}
			JOptionPane.showMessageDialog(null, result);
		}
	}
}



