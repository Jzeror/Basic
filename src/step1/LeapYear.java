package step1;

/**[문제]
연도를 4로 나눈값이 0 이라면 윤년일 수 있다.
그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
2000년은 4로 나눈값이 0 이라서 윤년일 수 있는데..
다시 이 값이 100으로 나눠 떨어지면 평년이다.
평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
예시) 2000년 과 2016 년을 입력하면 윤년으로 나옴
 * */
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("0.종료 1.실행");
			// int flag=scan.nextInt();

			switch (scan.nextInt()) {

			case 0:
				System.out.println("종료하겠습니다. 감사합니다.");
				return;
			case 1:

				System.out.println("연도를 입력해주세요.");
				int y = scan.nextInt();

				double a = y;
				String d = "평년";

				if (a % 400 == 0.0) {
					d = "윤년";
				} else if (a % 100 == 0.0) {
				} else if (a % 4 == 0.0) {
					d = "윤년";
				}
				System.out.println(y + "년도는 " + d + " 입니다");

			}
		}

	}

}
