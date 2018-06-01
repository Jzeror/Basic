package step1;

/**[문제] 
    월을 입력해서 해당 월의 마지막 날을
    알려주는 로직.
    예를 들면, 3월이면 말일이 3월31일입니다.
     9월이면 말일이 9월30일입니다.라고 알려줌.
    단 2월은 2월28일을 말일로 해서 2월28일입니다.
    라고 함.
 * */
import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("0.종료 1.실행");

			switch (scan.nextInt()) {

			case 0:
				System.out.println("종료하겠습니다. 감사합니다.");
				return;
			case 1:
				System.out.println("마지막 날을 알고 싶은 '월'을 입력하세요.");
				int mon = scan.nextInt();
				int fd = 28;
				switch (mon) {
				case 1:case 12:case 3:case 5:case 7:case 8:case 10:
					fd = 31;
					break;
				case 4:case 6:case 9:case 11:
					fd = 30;
					break;
				default:
					break;
				}
				System.out.println(mon + "월의 마지막 날은 " + mon + "월 " + fd + "일 " + "입니다");
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;

			}
		}

	}

}
