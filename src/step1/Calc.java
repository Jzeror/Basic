package step1;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		while (true) {
			System.out.println("0.종료 1.실행");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("종료하겠습니다. 감사합니다.");
				return;
			case 1:
				System.out.println("숫자1");
				int num1 = scan.nextInt();
				System.out.println("연산자 (+, -, *, /, %)");
				String op = scan.next();
				System.out.println("숫자2");
				int num2 = scan.nextInt();
				int num3 = 0;
				String result = "";
				
				switch (op) {
				case "+":
					num3 = num1 + num2;
					break;
				case "-":
					num3 = num1 - num2;
					break;
				case "*":
					num3 = num1 * num2;
					break;
				case "/":
					num3 = num1 / num2;
					break;
				case "%":
					num3 = num1 % num2;
					break;
				default:
					result = "ERROR";
					break;
				}
				if (!result.equals("ERROR")) {
					result = num1 + op + num2 + "=" + num3;
				}
				System.out.println(result);

				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;

			}
		}
	}

}
