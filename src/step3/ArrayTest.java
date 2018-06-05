package step3;

import javax.swing.JOptionPane;

public class ArrayTest {
	public static int getTotal(String[] scores) {
		return Integer.parseInt(scores[1]) + Integer.parseInt(scores[2]) + Integer.parseInt(scores[3]);
	}
	public static String[] getGrade(int total) {
		String[] result = new String[3];
		result[0] = String.valueOf(total);
		result[1] = String.valueOf(total / 3);
		switch (total / 30) {
		case 10:
			result[2] = "A";
			break;
		case 9:
			result[2] = "A";
			break;
		case 8:
			result[2] = "B";
			break;
		case 7:
			result[2] = "C";
			break;
		case 6:
			result[2] = "D";
			break;
		case 5:
			result[2] = "E";
		default:
			result[2] = "F";
			break;
		}
		return result;
	}
	public static void main(String[] args) {
		String[] aaa=new String[20];
		int ff=0;
		String aaaa="이름 / 국어 / 영어 / 수학 / 총점 / 평균 / 학점 /\n";
		while (true) {
			String menu = JOptionPane.showInputDialog("0.종료 1.성적입력 2.전체보기 3.순위출력");
			switch (menu) {
			case "0":
				return;
			case "1":
				String score = "";
				String[] arr = new String[4];
					score = JOptionPane.showInputDialog("이름/국어/영어/수학");
					arr = score.split("/");
				String[] result = getGrade(getTotal(arr));
				JOptionPane.showMessageDialog(null,
						"/이름 / 국어 / 영어 / 수학 / 총점 / 평균 / 학점 /\n"
						+ arr[0]+" /  "+arr[1]+"  /  "+arr[2]+" /  "+arr[3]+" /  "+result[0]+" /  "+result[1]+" /  "+result[2]);
				aaa[ff]= arr[0]+" /  "+arr[1]+"  /  "+arr[2]+" /  "+arr[3]+" /  "+result[0]+" /  "+result[1]+" /  "+result[2]+"\n";
				ff++;
				break;
			case "2":
					JOptionPane.showMessageDialog(null,aaaa+aaa[0]+aaa[1]+aaa[2]+aaa[3]+aaa[4]);
				break;
			case "3":
				break;
			default:
				break;
			} 
		}
	}
}
