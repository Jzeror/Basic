package step1;

/** [문제]
 * 대한비만학회는 기존에는 BMI가 
 * 18.5 미만이면 저체중, 18.5∼23은 정상, 23~25이면 과체중, 25∼30은 경도비만, 
 * 30∼35는 중등도비만 , 35 이상이면 고도비만으로 구분했었으나, 
 * 2018년 비만진료지침에서 단계별 용어가 새롭게 변경되어 
 * 18.5 미만이면 저체중, 18.5∼23은 정상, 23~25이면 '비만 전단계'[5], 
 * 25∼30은 '1단계 비만', 30∼35는 '2단계 비만' , 35 이상이면 '3단계 비만'으로 구분한다. 
 * */

import java.util.Scanner;

public class Bmi {
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
				System.out.println("귀하의 키를 Cm로 입력해주세요.");
				double hh = scan.nextDouble();
				double h = hh / 100;
				System.out.println("귀하의 몸무게를 Kg으로 입력해주세요.");
				int w = scan.nextInt();
				double f = w / (h * h);
				String g = "3단계 비만";
				if (f < 18.5) {
					g = "저체중";
				} else if (f < 23) {
					g = "정상";
				} else if (f < 25) {
					g = "비만 전단계";
				} else if (f < 30) {
					g = "1단계 비만";
				} else if (f < 35) {
					g = "2단계 비만";
				}
				System.out.println("귀하는 " + g + "입니다");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
