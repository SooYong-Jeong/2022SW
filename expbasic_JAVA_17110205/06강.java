package javaBeginner;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("��ǰ�ݾ� �Է� : ");
			String str = s.next();
			if(str.equals("��"))
				break;
			else
				sum += Integer.parseInt(str);			
		}
		System.out.println("�����Ͻ� ��ǰ���� �� ������ " + sum + "�Դϴ�.");
	}
}
