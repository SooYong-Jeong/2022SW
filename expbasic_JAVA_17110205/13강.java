package javaBeginner;

import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int student = 0;
		int[] scores = null;

		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------------------");
			System.out.print("����> ");
			switch(s.nextInt()) {
			case 1: System.out.print("�л���> ");
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
			System.out.println("�ְ� ���� : " + max);
			System.out.println("��� ���� : " + (double)sum/(scores.length));
			continue;
			case 5: break;
			}
			System.out.println("���α׷� ����");
			break;
		}
	}
}
