package javaBeginner;

import java.util.Scanner;

class CalcBMI{
	double height;

	public void convertHeight(int height) {
		this.height = (double)(height * 0.01);
	}

	public double man() {
		return height * height * 22;
	}

	public double woman() {
		return height * height * 21;
	}
}


public class Task18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CalcBMI calc = new CalcBMI();

		System.out.print("Ű�� �Է��ϼ��� : ");
		calc.convertHeight(s.nextInt());

		System.out.print("������ �Է��ϼ��� (��/��) : ");
		String input = s.next();

		char gender = input.charAt(0);
		if(gender == '��'){
			System.out.printf("������ ����� ǥ�� ü���� ");
			System.out.printf("%.1f", calc.man());
			System.out.println("�Դϴ�.");
			}
		else if(gender == '��') {
			System.out.printf("������ ����� ǥ�� ü���� ");
			System.out.printf("%.1f", calc.woman());
			System.out.println("�Դϴ�.");
			}

	}
}
