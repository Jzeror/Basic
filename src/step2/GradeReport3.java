package step2;

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

public class GradeReport3 {
	public static int[] input(Scanner scan) {
		int[] arr = new int[3];
		System.out.print("국어점수 ? \n");
		int ks = scan.nextInt();
		System.out.print("영어점수 ? \n");
		int es = scan.nextInt();
		System.out.print("수학점수 ? \n");
		int ms = scan.nextInt();
	
		arr[0] = ks;
		arr[1] = es;
		arr[2] = ms;

		return arr;
	}

	public static String[] getGrade(Scanner scan) {

		int[] arr = input(scan);
		String[] result = new String[3];

		result[0] = String.valueOf(arr[0] + arr[1] + arr[2]);
		result[1] = String.valueOf(Integer.parseInt(result[0]) / 3);

		switch (Integer.parseInt(result[1]) / 10) {
		case 10:
			result[2] = "A";
			break;
		case 9:
			result[2] = "A";
			break;
		case 8:
			result[2] = "B";
			break;
		case 7:
			result[2] = "C";
			break;
		case 6:
			result[2] = "D";
			break;
		case 5:
			result[2] = "E";
			break;
		default:
			result[2] = "F";
			break;
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("0.종료 1.실행");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				System.out.print("이름 ? \n");
				String name = scan.next();

				String[] result = getGrade(scan);
				System.out.printf("********************************\n");
				System.out.printf("l 이름 l 총점 l l 평균 l 등급 l\n");
				System.out.printf("--------------------------------\n");
				System.out.printf("l %s l %s l%s l %s  l\n", name, result[0], result[1], result[2]);
				System.out.printf("********************************");

			default:
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
