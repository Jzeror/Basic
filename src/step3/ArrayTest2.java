package step3;

import javax.swing.JOptionPane;

public class ArrayTest2 {
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

		String[] students = new String[3];
		String[] ranking = { "1등", "2등", "3등" };
		String[] rank = new String[3];
		int count = 0;
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

				String student = arr[0] + " / " + arr[1] + " / " + arr[2] + " / " + result[0] + " / " + result[1]+" / " + result[2]+"\n";
				students[count] = student;
				count++;
				break;
			case "2":
				String aaaa = "이름 / 국어 / 영어 / 수학 / 총점 / 평균 / 학점 / \n";
				for (int i = 0; i < students.length; i++) {
					aaaa += students[i];
				}
				JOptionPane.showMessageDialog(null, aaaa);
				break;
			case "3":
				String[] temp = students[0].split(" / ");
				int a = Integer.parseInt(temp[4]);
				temp = students[1].split(" / ");
				int b = Integer.parseInt(temp[4]);
				temp = students[2].split(" / ");
				int c = Integer.parseInt(temp[4]);

				if (a > b && a > c) {
					rank[0] = ranking[0];
					if (b > c) {
						rank[1] = ranking[1];
						rank[2] = ranking[2];// a>b>c
					} else {
						rank[1] = ranking[2];
						rank[2] = ranking[1];// a>c>b
					}
				} else if (b > c) {
					rank[1] = ranking[0];
					if (a > c) {
						rank[0] = ranking[1];
						rank[2] = ranking[2]; // b>a>c
					}else {
				
						rank[2] = ranking[1]; rank[0] = ranking[2]; // b>c>a
					}
				} else if (a > b) {
					rank[2] = ranking[0];
					rank[0] = ranking[1];
					rank[1] = ranking[2]; // c>a>b
				} else {
					rank[2] = ranking[0];
					rank[0] = ranking[2];
					rank[1] = ranking[1]; // c>b>a
				}
				String[] name = new String[3];
				temp = students[0].split(" / ");
				name[0] = temp[0];
				temp = students[1].split(" / ");
				name[1] = temp[0];
				temp = students[2].split(" / ");
				name[2] = temp[0];
				JOptionPane.showMessageDialog(null,
						name[0] +" : "+ rank[0] + "\n" + name[1] +" : "+ rank[1] + "\n" + name[2] +" : "+ rank[2] + "\n");
				break;
			default:
				break;
			}
		}
	}
}
