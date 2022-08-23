package javaBeginner;

import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int student = 0;
		int[] scores = null;

		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			switch(s.nextInt()) {
			case 1: System.out.print("학생수> ");
			student = s.nextInt();
			scores = new int[student];
			continue;
			case 2: for(int i = 0; i < scores.length; i++) {
				System.out.print("scores[" + i + "] : ");
				scores[i] = s.nextInt();
			}
			continue;
			case 3: for(int i = 0; i < scores.length; i++)
				System.out.println("scores[" + i + "] : " + scores[i]);
			continue;
			case 4: int sum = 0;
			int max = scores[0];
			for(int i = 0; i < scores.length; i++) {
				sum += scores[i];
				if(scores[i] > max)
					max = scores[i];
			}
			System.out.println("최고 점수 : " + max);
			System.out.println("평균 점수 : " + (double)sum/(scores.length));
			continue;
			case 5: break;
			}
			System.out.println("프로그램 종료");
			break;
		}
	}
}
