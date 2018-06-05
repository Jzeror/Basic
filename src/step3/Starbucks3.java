package step3;

import javax.swing.JOptionPane;

public class Starbucks3 {
	public static String getItemPrice(String count,int i) {
		String[] price= {"3000", "3500","4000"};
		return String.valueOf(Integer.parseInt(price[i]) * Integer.parseInt(count));
	}
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
			case "1": case "2": case "3":
				sum+= Integer.parseInt(getItemPrice(JOptionPane.showInputDialog("몇 잔 드릴까요?\n"),Integer.parseInt(option)-1));
				result = "주문 금액 : " + sum;
				break;

			}
			JOptionPane.showMessageDialog(null, result);
		}
	}
}



