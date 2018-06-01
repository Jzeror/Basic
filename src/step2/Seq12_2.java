package step2;

import java.util.Scanner;

/**
 * [수열012] 홀수짝수의 합계
 */
public class Seq12_2 {

	public static int[] input(Scanner sc) {
		int[] result = new int[2];
		System.out.println("시작값을 입력하시오.");
		int num1 = sc.nextInt();
		System.out.println("끝값을 입력하시오");
		int num2 = sc.nextInt();

		int start = 0, end = 0;
		if (num1 > num2) {
			start = num2;
			end = num1;
		} else {
			start = num1;
			end = num2;
		}
		result[0] = start;
		result[1] = end;
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("0.종료 1.홀수의 합 2.짝수의 합");
			switch (sc.nextInt()) {
			case 0:
				return;
			case 1:
				//
				int start = 0	, end = 0, count = 0, totalCount = 0, sum = 0;
				String result = "";
				int[] arr = input(sc);
				start = arr[0];    //인덱스 값을 넣어주는 것이기에 
				end = arr[1];
				//
				for (int i = start; i <= end; i++) {
					if (i % 2 != 0) {
						count++;
					}
				}
				totalCount = count;
				count = 0;
				for (int i = start; i <= end; i++) {
					if (i % 2 != 0) {
						count++;
						if (count == totalCount) {
							result += i + "=";
						} else {
							result += i + "+";
						}
						sum += i;

					}

				}
				System.out.println(result + sum);
				break;
			case 2:
				//
				start = 1;	end = 0;	count = 0;	totalCount = 0;	sum = 0;	result = "";
				arr=input(sc);
				end=arr[1];
				start=arr[0];
				//
				for (int i = start; i <= end; i++) {
					if (i % 2 == 0) {
						count++;
					}
				}
				totalCount = count;
				count = 0;
				for (int i = start; i <= end; i++) {
					if (i % 2 == 0) {
						count++;
						if (count == totalCount) {
							result += i + "=";
						} else {
							result += i + "+";
						}
						sum += i;

					}

				}
				System.out.println(result + sum);
				break;
			default:
				return;
			}
		}
	}
}