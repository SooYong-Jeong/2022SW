package javaBeginner;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("��ȯ�� ����? ");
		int exchange = s.nextInt();
		
		System.out.println("500��¥�� : " + exchange/500 + "��");
		exchange %= 500;
		System.out.println("100��¥�� : " + exchange/100 + "��");
		exchange %= 100;
		System.out.println("50��¥�� : " + exchange/50 + "��");
		exchange %= 50;
		System.out.println("10��¥�� : " + exchange/10 + "��");
		exchange %= 10;
		System.out.println("�ٲ��� ���� �ܵ� : " + exchange + "��");
	}
}
