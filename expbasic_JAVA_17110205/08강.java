package javaBeginner;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("구매 금액을 입력하세요[0-500] ");
		int money = s.nextInt();
		int exchange = 500 - money;
		System.out.println((500-money) + "원의 거스름돈은 다음과 같다 : ");
		System.out.println("100원짜리 동전 " + (exchange/100) + "개");
		exchange %= 100;
		System.out.println("10원짜리 동전 " + (exchange/10) + "개");
		exchange %= 10;
		System.out.println("10원짜리 동전 " + (exchange/1) + "개");
	}
}
