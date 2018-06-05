package step3;

/**
 가위바위보
 * */

import javax.swing.JOptionPane;
public class RPSGame2{
	public static void main(String[] args){
		
		String result = "";
		int play=0, lose=0, win=0, draw=0;
		while(true) {
			String a=JOptionPane.showInputDialog("주-1, 보-2, 가위-3");
						int b=0;
			for(int i=1; i<2 ; i++) {
				b=(int)(Math.random()*10);
				if(b!=1&&b!=2&&b!=3) {
					i--;
				}
			}
						switch((Integer.parseInt(a)-b-1)%3) {
			case -1 : result="무승부";
							play++; draw++; break;
			case 0 : result="승리";play++; win++;break;
			case -2 :result= "패배";play++; lose++;break;
			case 1 :result= "패배";play++; lose++;break;
			}
			JOptionPane.showMessageDialog(null,result+"플레이:" +play+"  승리: "+ win+"  무승부:"+ draw+"  패배:"+lose);
			}
	}
	
}