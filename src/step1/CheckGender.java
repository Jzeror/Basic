package step1;

/**[문제]
*  교수가 주민번호를 입력하면 해당 학생이 남자인지, 여자인지, 외국인인지
* 자동 으로 출력해 주는 프로그램을 만들어 달랍니다.
* 오더는 다음과 같이 화면에 출력하라고 합니다.
* 홍길동 : 800101 -1234567 : 남
* 입력값은 이름과 주민번호이고 남은 자동으로 출력되는 값입니다.
* 현행법상 1, 3으로 시작되면 남자, 2, 4로 시작되면 여자, 5,6 이면 외국인
* 교수가 실수로 0,7,8,9 로 시작 주민번호를 입력하면
* "다시 입력하세요" 라고 알려주시길 바랍니다.
 * */
import java.util.Scanner;
public class CheckGender {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		while (true) {
			System.out.print("0.종료 1.실행");
			int flag = scan.nextInt();

			switch (flag) {
			case 0:
				System.out.print("종료하겠습니다.");
				return;
			case 1:
				System.out.println("이름을 입력해주세요");
				String name = scan.next();
				System.out.println("주민등록번호를 -포함하여 모두 입력해주세요");
				String num = scan.next();
				String s = "외국인";
				char ch = num.charAt(7);
				if (ch > '6' || ch < '1') {
					System.out.print("다시 한번 입력해주시기 바랍니다.");
					break;
				}
				switch (ch) {
				case '1':
				case '3':
					s = "남성";
					break;
				case '2':
				case '4':
					s = "여성";
					break;
				default:
					break;
				}
				System.out.println(name + " : " + num + " : " + s);
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}

	}

}
