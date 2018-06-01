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

public class GradeReport {
	public static int[] input(Scanner scan) {
		int[] result = new int[3];
		System.out.print("국어점수 ? \n");
		int ks = scan.nextInt();
		// result[0] = ks;
		if (ks > 100 || ks < 0) {
			System.out.println("잘못된 값입니다.");
		}
		System.out.print("영어점수 ? \n");
		int es = scan.nextInt();
		// result[1] = es;
		if (es > 100 || es < 0) {
			System.out.println("잘못된 값입니다.");

		}
		System.out.print("수학점수 ? \n");
		int ms = scan.nextInt();
		// result[2] = ms;
		if (ms > 100 || ms < 0) {
			System.out.println("잘못된 값입니다.");

		}
		result[0] = ks;
		result[1] = es;
		result[2] = ms;

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

				int[] arr = input(scan);
				int ks = arr[0];
				int es = arr[1];
				int ms = arr[2];

				int total = ks + es + ms;
				int rs = total / 3;
				String gs = "f";

				switch (rs / 10) {
				case 10:
					gs = "A";
					break;
				case 9:
					gs = "A";
					break;
				case 8:
					gs = "B";
					break;
				case 7:
					gs = "C";
					break;
				case 6:
					gs = "D";
					break;
				case 5:
					gs = "E";
					break;
				default:
					break;
				}
				System.out.printf("********************************\n");
				System.out.printf("l 이름 l 총점 l l 평균 l 등급 l\n");
				System.out.printf("--------------------------------\n");
				System.out.printf("l %s l %d l%d l %s  l\n", name,total,rs,gs);
				System.out.printf("********************************");

			default:
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
