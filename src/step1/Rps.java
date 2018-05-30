package step1;

import java.util.Scanner;

public class Rps {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("0.종료 1.실행");

			switch (scan.nextInt()) {

			case 0:
				System.out.println("종료하겠습니다. 감사합니다.");
				return;
			case 1:

				System.out.print("플레이어1 주먹(1), 보자기(2), 가위(3) 중에 하나를 고르십시오.");
				int P1 = scan.nextInt();
				System.out.print("플레이어2 주먹(1), 보자기(2), 가위(3) 중에 하나를 고르십시오.");
				int P2 = scan.nextInt();
				if (P1 == P2) {
					System.out.println("두 플레이어가 무승부하였습니다.");

				} else if (P1 > P2) {
					System.out.println("플레이어1이 승리하였습니다.");
				} else {
					System.out.println("플레이어2가 승리하였습니다.");
				}

				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;

			}
		}
	}

}
