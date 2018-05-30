package step1;

import java.util.Scanner;

public class HowMuch {
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
				System.out.println("얼마에요?");
				int vari1 = scan.nextInt();
				System.out.println(vari1 + " 원입니다.");
				System.out.println("몇 개 드릴까요?");
				int vari2 = scan.nextInt();
				System.out.println(vari2 + " 개 주세요.");
				int sum1 = vari1 * vari2;
				System.out.println("총 금액은 " + sum1 + " 원 입니다.");
				System.out.println("비싸요. 깍아주세요.");
				System.out.println("몇 퍼센트 DC 해드릴까요?");
				double dsc = scan.nextInt();
				double fin = sum1 * (1 - dsc / 100);
				String g = "안 팔아요.";
				if (dsc <= 10) {
					g = fin + " 원 입니다.";
				}
				System.out.println(g);

				break;
			default:
				break;
			}

		}

	}

}
