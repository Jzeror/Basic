package example;
import java.util.Scanner;
public class If2_03 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 숫자?");
int num1=sc.nextInt();
int result=0;
System.out.println("덧셈 뺄셈 곱셈 나눗셈 ");
String opcode=sc.next();
System.out.printf("두번째 숫자?");
int num2=sc.nextInt();
if(opcode.equals("덧셈")) {
	result=num1+num2;}else
	if(opcode.equals("뺄셈")) {
		result=num1-num2;}
	else if(opcode.equals("곱셈")) {
			result=num1*num2;
		}else {result=num1/num2;}
			
System.out.println(num1+opcode+num2+"="+result);

}}
