package javaBeginner;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("구매 금액을 입력하세요 : ");
		int money = s.nextInt();
		
		System.out.println("구매금액 = " + money );
		if(money >= 300000)
			money -= (money / 100) * 10;
		else if(money >= 100000)
			money -= (money / 100) * 5;
		System.out.println("청구 금액 = " + money);
	}
}
