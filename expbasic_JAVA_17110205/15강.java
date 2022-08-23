package javaBeginner;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int order = 0;
		int number;
		int[] myLotto = new int[6];
		int[] lotto = new int [7];
		int[] result = new int[6];
		int count, check;

		System.out.println("\t\t\t====�ζǽý���===");
		System.out.println("\n(1~45������ ���� �Է��ϼ���)");

		while(order < 6) {
			check = 1;

			System.out.printf("[%d] ��ȣ �Է� : ", order+1);
			number = sc.nextInt();

			for(int i =0; i < 6; i++) {
				if(number == myLotto[i]) {
					check = 0;
					break;
				}
			}
			if(check !=0) {
				myLotto[order] = number;
				order++;
			}else {
				System.out.println("�ߺ��� ��ȣ�Դϴ�. �ٽ� �Է�");
			}
		}
		System.out.print("\n����� ������>");
		for(int i =0; i < myLotto.length; i++) {
			System.out.print(myLotto[i] + " ");
		}
		for(int i = 0; i< lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
		}
		System.out.print("\n\n�̹�ȸ�� ��÷ ����� ");

		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.printf(" + ���ʽ� ��ȣ %d �Դϴ�. \n", lotto[6]);

		count = 0;
		for(int i = 0; i < 6; i++)
			for(int j = 0; j < 7; j++)
				if(myLotto[i] == lotto[j]) {
					result[count]= myLotto[i];
					count++;
				}

		System.out.printf("������ȣ���� : %d\n", count);
		if(count>0) {
			System.out.print("��÷��ȣ�� ");
			for(int i= 0; i < count; i++)
				System.out.print(result[i] + " ");
			System.out.println("�Դϴ�.");
		}

		if(count == 6) {
			if(result[count] == lotto[5])
				System.out.println("\n ��÷����� 1���Դϴ�.");
			else
				System.out.println("\n ��÷����� 2���Դϴ�.");
		}
		else if(count == 5)
			System.out.println("\n ��÷����� 3���Դϴ�.");
		else if(count == 4)
			System.out.println("\n ��÷����� 4���Դϴ�.");
		else if(count == 3)
			System.out.println("\n ��÷����� 5���Դϴ�.");
		else	
			System.out.println("\n ��÷����� ���Դϴ�.");
	}
}



