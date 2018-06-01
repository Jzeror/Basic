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

public class GradeReport2 {
	public static String input(Scanner scan) {
		String result = "";

		System.out.print("국어 \n");
		int a1 = scan.nextInt();
		System.out.print("영어 \n");
		int a2 = scan.nextInt();
		System.out.print("수학 \n");
		int a3 = scan.nextInt();
		result= a1+","+a2+","+a3;

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
				String arr = input(scan);
				String[] b=new String[3];
				
				int ks=0, es=0, ms=0;
				b=arr.split(",");
				ks=Integer.parseInt(b[0]);
				es=Integer.parseInt(b[1]);
				ms=Integer.parseInt(b[2]);
				
				
				
				
				int total = ks + es + ms;
				int rs = total / 3;
				String gs = "f";

				switch (rs / 10) {
				case 10:gs = "A";break;
				case 9:	gs = "A";break;
				case 8:gs = "B";break;
				case 7: gs = "C";	break;
				case 6: gs = "D";	break;
				case 5: gs = "E";	break;
				default:
					break;
				}
				
				
				System.out.printf("********************************\n");
				System.out.printf("l 이름 l 총점 l l 평균 l 등급 l\n");
				System.out.printf("--------------------------------\n");
				System.out.printf("l %s l %s l%s l %s  l\n", name, total, rs, gs);
				System.out.printf("********************************\n");

			default:
				break;
			}
		}
	}
}
