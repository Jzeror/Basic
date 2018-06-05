package step3;

/**
 값을 두개 입력받아서 오칙연산(+,-,*,/,%)
*/
import javax.swing.JOptionPane;

public class Calc {
	public static void main(String[] args) {
		
		String result = "";
		String num1 = JOptionPane.showInputDialog("숫자 입력");
		result+=String.valueOf(num1);
		int sum = Integer.parseInt(num1);
		while (true) {
			String num2="";
			switch (JOptionPane.showInputDialog("연산자")) {
			case "=":
				result += "=";
				JOptionPane.showMessageDialog(null, result+sum);
				break;
			case "+":
				num2 = JOptionPane.showInputDialog("숫자 입력");
				sum+=Integer.parseInt(num2);
				result+="+"+num2;
				break;
			case "-":
				num2 = JOptionPane.showInputDialog("숫자 입력");
				sum-=Integer.parseInt(num2);
				result+="-"+num2;
				break;
			case "*":
				num2 = JOptionPane.showInputDialog("숫자 입력");
				sum*=Integer.parseInt(num2);
				result+="*"+num2;
				break;
			case "/":
				num2 = JOptionPane.showInputDialog("숫자 입력");
				sum/=Integer.parseInt(num2);
				result+="/"+num2;
				break;
			case "%":
				num2 = JOptionPane.showInputDialog("숫자 입력");
				sum%=Integer.parseInt(num2);
				result+="%"+num2;
				break;
			}
			}

	}
}