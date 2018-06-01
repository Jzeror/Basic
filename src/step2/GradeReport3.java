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
	public static boolean input(int param) {
/*		boolean flag =false;*/
/*		if(param>=0 && param<=100) {
			flag =true;
		}else {
			flag = false;
		}*/
/*		flag = (param>=0 && param<=100 ) ? true:false ;*/
		return (param>=0 && param<=100 ) ? true:false ;;
	}
	public static String[] getTotal(String[] params) {
		String[] result =new String[10];
		result[0] = String.valueOf(params[0] + params[1] + params[2]);
		result[1] = String.valueOf(Integer.parseInt(result[0]) / 3);
		return result;
	}
	public static String[] getGrade(String[] params) {
		String[] result = new String[3];
		result[0] = params[0];
		result[1] = params[1];
		switch (params[1] / 10) {
		case 10:
			result[1] = "A";
			break;
		case 9:
			result[1] = "A";
			break;
		case 8:
			result[1] = "B";
			break;
		case 7:
			result[1] = "C";
			break;
		case 6:
			result[1] = "D";
			break;
		case 5:
			result[1] = "E";
			break;
		default:
			result[1] = "F";
			break;
		}
		return result;

	}

	public static void main(String[] args) {
		String[] params = new String[10];  //임의로 열개 준거 비슷할수록 좋음
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
				String[] subjects = {"국어","영어", "수학"};
				for(int i=0; i<subjects.length;i++) {
					System.out.print(subjects[i]+"점수를 입혁하세요 \n");
					int temp = Integer.parseInt(scan.next());
					if(input(temp)) {
					params[i]= String.valueOf(temp);
					}else {
							i--;
					}
				}
							
				String[] arr2 = getGrade(getTotal(params));
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
