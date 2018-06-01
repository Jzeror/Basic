package step2;

public class Practice {

	public static void main(String[] args) {
int sum=0,a=1;
String result="";
		for(int i=1;i<=20;i++) {
			sum+=a;
			result+=a+"+";
			a+=a+i;
				
		}
		
		System.out.println(sum+"/"+result);
	}

}
