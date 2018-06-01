package step2;
/**
항 사이의 증가하는 값이 일정한 비율로 증가하는 수열(스캐너 없음)
1+2+4+7+11+16+22+...순서로 나열되는
수열의 20번째 항까지의 합계
 * */


public class Seq013 {

	public static void main(String[] args) {
		
		int count=0;
		String result="";
		int sum= 0;
		int tsum=0;
		int a=1;
			
		for(int i=1; i<=20; i++) {
		if(i==20) {
					sum+=a;
					result+=a+"=";
					a=a+i;
		
		}else {
			sum+=a;
			result+=a+"+";
			a=a+i;
		}
	
		}	System.out.println(result+sum);

	}}


