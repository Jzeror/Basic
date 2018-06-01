package step2;

/**
 * [수열011] 1-2+3-4+5-6....-100 = -50 합계(스캐너 없음)
 */

public class Seq011 {
	public static void main(String[] args) {
		String result = "";
		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 1) {
				result += i + "-";
				sum+=i;
			} else {
				if (i == 100) {
					result += i + "=";
					sum-=i;
				} else {
					result += i + "+";
					sum-=i;
				}
			}

		}
		System.out.print(result+sum);

	}
}
