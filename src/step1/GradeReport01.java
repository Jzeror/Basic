package step1;

import java.util.Scanner;

public class GradeReport01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("0.종료 1.실행");
			int flag = scan.nextInt();

			switch (flag) {

			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				System.out.print("이름 ? \n");
				String name = scan.next();
				System.out.print("국어점수 ? \n");
				int ks = scan.nextInt();
				if (ks > 100 || ks < 0) {
					System.out.println("잘못된 값입니다.");
					break;
				}
				System.out.print("영어점수 ? \n");
				int es = scan.nextInt();
				if (es > 100 || es < 0) {
					System.out.println("잘못된 값입니다.");
					break;
				}
				System.out.print("수학점수 ? \n");
				int ms = scan.nextInt();
				if (ms > 100 || ms < 0) {
					System.out.println("잘못된 값입니다.");
					break;
				}
				int rs = (ks + es + ms) / 3;
				String gs = "F";

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

				System.out.println(name + " 평균 " + rs + " 학점 " + gs);

				break;
			default:
				System.out.println("종료합니다.");
				break;

			}

		}

	}

}
