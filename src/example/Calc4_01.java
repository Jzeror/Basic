package example;
import java.util.Scanner;

public class Calc4_01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("첫번째 계산할 값을 입력하세요");
		double a=sc.nextDouble();
		System.out.printf("두번째 계산할 값을 입력하세요");
		double b=sc.nextDouble();
	
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
	}

}
