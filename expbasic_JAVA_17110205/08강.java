package javaBeginner;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �ݾ��� �Է��ϼ���[0-500] ");
		int money = s.nextInt();
		int exchange = 500 - money;
		System.out.println((500-money) + "���� �Ž������� ������ ���� : ");
		System.out.println("100��¥�� ���� " + (exchange/100) + "��");
		exchange %= 100;
		System.out.println("10��¥�� ���� " + (exchange/10) + "��");
		exchange %= 10;
		System.out.println("10��¥�� ���� " + (exchange/1) + "��");
	}
}
