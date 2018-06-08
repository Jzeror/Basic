package example;
import java.util.Scanner;

public class Sum2_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 계산할 값을 입력하세요");
int a=sc.nextInt();
		System.out.println("두번째 계산할 값을 입력하세요");
		int b=sc.nextInt();
		System.out.println("세번째 계산할 값을 입력하세요");
		int c=sc.nextInt();
		
		System.out.println("네번째 계산할 값을 입력하세요");
		int d=sc.nextInt();
		
		System.out.printf("답"+a+b+c+d);
	}

}
