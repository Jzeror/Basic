package step3;

import java.util.Scanner;

public class Starbucks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];

		int sum = 0;
		while (true) {

			String result = "";
			System.out.println("무엇으로 드릴까요");
			System.out.println("0.종료 \n" + "1.아메리카노3000\n" + "2.라떼3500\n" + "3.카푸치노4000\n");
			a[0] = sc.nextInt();
			if (a[0] == 0) {
			} else {
				System.out.println("몇잔 드릴까요?");
				a[1] = sc.nextInt();
			}

			switch (a[0]) {
			case 0:
				result=(sum > 0)?"총 결제 금액 " + sum + "입니다" : "이용해주셔서 감사합니다";
				break;
			case 1:
				sum += 3000 * a[1];
				break;
			case 2:
				sum += 3500 * a[1];
				break;
			case 3:
				sum += 4000 * a[1];
				break;
			default:
				break;
			}

			System.out.println(result);
		}
	}
}