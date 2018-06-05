package step3;

/**
 [요구사항] 평균 점수에 따라 A ~ F 까지 등급을 부여하는
프로그램을 작성해 주시오.
100 ~ 90 A
89 ~ 80 B
79 ~ 70 C
69 ~ 60 D
59 ~ 50 E
49 ~ 0 F
화면 출력은 다음과 같습니다.
********************************
| 이름 | 총점 | 평균 등급 |
--------------------------------
| 홍길동 | 270 | 90 | A |
 */
import java.util.Scanner;

public class GradeReport {

	public static boolean input(int temp) {
		return (temp >= 0 && temp <= 100) ? true : false;
	}

	public static String[] getTotal(String[] param) {
		String[] result = new String[3];
		result[0] = String
				.valueOf(Integer.parseInt(param[0]) + Integer.parseInt(param[1]) + Integer.parseInt(param[2]));
		result[1] = String.valueOf(Integer.parseInt(result[0]) / 3);
		return result;
	}

	public static String[] getGrade(String[] param) {
		
		switch (Integer.parseInt(param[0]) / 30) {
		case 10:
			param[2] = "A";
			break;
		case 9:
			param[2] = "A";
			break;
		case 8:
			param[2] = "B";
			break;
		case 7:
			param[2] = "C";
			break;
		case 6:
			param[2] = "D";
			break;
		case 5:
			param[2] = "E";
			break;
		default:
			param[2] = "F";
			break;
		}
																																											
		return param;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("0. End  1. Strart");
			switch (Integer.parseInt(sc.next())) { 
			case 0:
				System.out.println("The End.");
				return;
			case 1:
				System.out.println("What's your name?");
				String name = sc.next();
				String[] param = new String[100];
				String[] score = { "국어", "영어", "수학" };

				for (int i = 0; i < score.length; i++) {
					System.out.print("what's your " + score[i] + "?");
					int temp = Integer.parseInt(sc.next());
					if (input(temp)) {
						param[i] = String.valueOf(temp);
					} else {
						i--;
					}

				}

				param = getGrade(getTotal(param));

				System.out.printf("********************************\n");
				System.out.printf("l name l total l l average l grade l\n");
				System.out.printf("--------------------------------\n");
				System.out.printf("l   %s  l   %s  l   %s  l   %s  l  \n", name, param[0], param[1], param[2]);
				System.out.printf("********************************\n");

				break;
			default:
				break;

			}
		}
	}

}