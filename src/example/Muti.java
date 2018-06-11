package example;

import org.omg.Messaging.SyncScopeHelper;

public class Muti {

	public static void main(String[] args) {

		String result="",result1="";
		for(int j=1;j<=9;j++) {
			for(int i=2;i<=5;i++) {
				result+=i+" X "+j+" =" +i*j+"  ";
			}result+="\n";
			for(int i=6;i<=9;i++) {
				result1+=i+" X "+j+" =" +i*j+"  ";
			}result1+="\n";
			
			
		}System.out.println(result+"\n"+result1);
	}

}
