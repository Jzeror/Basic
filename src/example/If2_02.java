package example;

import java.util.Scanner;

public class If2_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자?");
		int num1 = sc.nextInt();
		int result = 0;
		System.out.println("+ - *  / % ");
		String opcode = sc.next();
		System.out.printf("두번째 숫자?");
		int num2 = sc.nextInt();
		if (opcode.equals("+")) {
			result = num1 + num2;
		} else if (opcode.equals("-")) {
			result = num1 - num2;
		} else if (opcode.equals("*")) {
			result = num1 * num2;
		} else if (opcode.equals("/")) {
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다"); return;
			}
			result = num1 / num2;

		} else {
			result = num1 % num2;
		}

		System.out.println(num1 + opcode + num2 + "=" + result);

	}
}
