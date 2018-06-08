package example;
import java.util.Scanner;
public class If_duplication {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
String num1=sc.next();
System.out.println("연산자를(+,-,*,/,%) 입력하세요");
String opcode=sc.next();
System.out.println("두번째 수를 입력하세요");
String num2=sc.next();
if(opcode.equals("*")) {
	String result=String.valueOf(Integer.parseInt(num1)*Integer.parseInt(num2));
	System.out.println(result);
}else {System.out.println("잘못입력");
return;}
	
	}

}
