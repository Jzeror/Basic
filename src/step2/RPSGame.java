package step2;
/**
 가위바위보
 * */
import java.util.Scanner;





public class RPSGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("0.종료 1.실행");

			switch (scan.nextInt()) {

			case 0:
				System.out.println("종료하겠습니다.");
				return;
			case 1:

				System.out.print("플레이어1 주(1), 보(2), 가(3) 중에 하나");
				int P1 = scan.nextInt();
				System.out.print("플레이어2 주(1), 보(2), 가(3) 중에 하나");
				int P2 = scan.nextInt();
				if (P1 == P2) {
					System.out.println("무승부하였습니다.");

				} else if (P1 > P2) {
					System.out.println("플레이어1이 승리");
				} else {
					System.out.println("플레이어2가 승리");
				}

				break;
			default:
				System.out.println("잘못 입력");
				break;

			}
		}
	}

}
