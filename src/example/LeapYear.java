package example;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		System.out.println("연도를입력하세요");
		String year=String.valueOf(sc.next());
	String result="평년";
		int yearc=Integer.parseInt(year);
if(yearc%400==0) {result="윤년";}else if(yearc%100==0) {}else if(yearc%4==0) {result="윤년";}
		
System.out.println(year+"년은 "+result+" 입니다.");
	}

}
