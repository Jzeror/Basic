package example;
import java.util.Scanner;
public class Change4_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("## 교환할 금액은?");
		int change=sc.nextInt();
		String ob=String.valueOf(change/500);
		String ob2=String.valueOf(change%500);
		String b=String.valueOf(Integer.parseInt(ob2)/100);
		String b2=String.valueOf(Integer.parseInt(ob2)%100);
		String os=String.valueOf(Integer.parseInt(b2)/50);
		String os2=String.valueOf(Integer.parseInt(b2)%50);
		String s=String.valueOf(Integer.parseInt(os2)/10);
		String s2=String.valueOf(Integer.parseInt(os2)%10);
System.out.println("오백원짜리 ==> "+ ob+" 개"+"\n"+
		"백원짜리 ==> "+ b+" 개"+"\n"+
		"오십원짜리 ==> "+ os+" 개"+"\n"+
		"십원짜리 ==> "+ s+" 개"+"\n"+"남은 금액 ==> "+ s2+" 개"+"\n");
		
	}

}
