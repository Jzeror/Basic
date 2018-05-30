package step1;

import java.util.Scanner;

public class Series {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("0.종료 1.실행");
			int flag = scan.nextInt();
			switch (flag) {
			case 0:
				System.out.println("종료합니다. 감사합니다.");
				return;
			case 1:
				System.out.println("첫번째 수를 입력하세요");
				int num1 = scan.nextInt();
				System.out.println("두번째 수를 입혁하세요?");
				int num2 = scan.nextInt();
				int c = num2;
				if (num1 > num2) {
					num2 = num1;
					num1 = c;
				}
				String result = "";
				int sum = 0;
				while (num1 <= num2) {
					if (num1 == num2) {
						result += num1 + "=";
					} else {
						result += num1 + "+";
					}
					sum += num1;
					num1++;
				}
				System.out.println(result + sum);

				break;
			default:
				System.out.println(" 잘못 입력하셨습니다");
				break;
			}
		}
	}

}
