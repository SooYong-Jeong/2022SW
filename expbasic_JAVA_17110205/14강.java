package javaBeginner;

import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String accessCode = "sa7946";

		int[] sales = new int[5];
		int errorCount = 0;
		int sum = 0;

		System.out.println("==============�����Է½ý���=============");
		while(true) {
			System.out.print("�����ڵ带 �Է��ϼ��� : ");
			String input = s.nextLine();

			if(input.equals(accessCode)) {
				System.out.println("--�ý��ۿ� �����Ͽ����ϴ�.--");

				for(int i = 0; i < sales.length; i++) {
					System.out.print("�Ǹſ��� ��ȣ> ");
					if(s.nextInt() == (i+1)) {
						System.out.print("�Ǹſ� " + (i+1) + "�� �����> ");
						sales[i] = s.nextInt();
					}
				}
				
				int max = sales[0];
				int min = sales[0];
				int maxid = 0, minid = 0;
				
				for(int i = 0; i < sales.length; i++) {
					sum += sales[i];
					if(sales[i] >= max) {
						maxid = i+1;
						max = sales[i];
					}
					if(sales[i] <= min) {
						minid = i+1;
						min = sales[i];
					}
				}

				System.out.println();
				System.out.println("�Ǹſ����� �����");
				System.out.println("------------------------------------------");
				for(int i = 0; i < sales.length; i++)
					System.out.println("�Ǹſ� " + (i+1) + "\t\t" + sales[i]);
				System.out.println("�� ����� : " + sum);
				System.out.println("��� ����� : " + (double)(sum / sales.length));
				System.out.println("�ִ� ����� : " + max + "(�Ǹſ� " + maxid + ")");
				System.out.println("�ּ� ����� : " + min + "(�Ǹſ� " + minid + ")");
				break;
			}
			else {
				errorCount++;
				if(errorCount == 3) {
					System.out.println("������ �ź��մϴ�");
					break;
				}
				System.out.println("�����ڵ带 ��Ȯ���ϼ���");
			}
		}
	}
}
