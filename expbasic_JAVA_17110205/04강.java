package javaBeginner;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �ݾ��� �Է��ϼ��� : ");
		int money = s.nextInt();
		
		System.out.println("���űݾ� = " + money );
		if(money >= 300000)
			money -= (money / 100) * 10;
		else if(money >= 100000)
			money -= (money / 100) * 5;
		System.out.println("û�� �ݾ� = " + money);
	}
}
