package step2;
/**
 가위바위보
 * */
import java.util.Scanner;
public class RPSGame {
	
	public static String result(String[] arr) {
		String result1 = "";
		if (Integer.parseInt(arr[1]) - Integer.parseInt(arr[2]) == 0) {
			result1 = "무승부";
		} else if (((Integer.parseInt(arr[1]) - Integer.parseInt(arr[2])) + 1) % 3 == 0) {
			result1 = "p2 승리";
		} else {
			result1 = "p1 승리";
		}
		return result1;
	}

	public static String[] input(String[] arr2) {
		for (int i = 1; i < 3; i++) {
			if (arr2[i].equals("주먹")) {
				arr2[i] = String.valueOf(1);
			} else if (arr2[i].equals("보")) {
				arr2[i] = String.valueOf(2);
			} else if (arr2[i].equals("가위")) {
				arr2[i] = String.valueOf(3);
			}
		}
		return arr2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("0.종료 1.실행\n");
			switch (Integer.parseInt(sc.next())) {
			case 0:
				System.out.println("감사합니다.");
				return;
			case 1:
				String[] arr = new String[3];
				for (int i = 1; i < 3; i++) {
					System.out.println("플레이어" + i);
					arr[i] = sc.next();
				}
				System.out.println(result(input(arr)));
				break;
			default:
				break;
			}
		}
	}
}