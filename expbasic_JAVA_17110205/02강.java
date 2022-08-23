package javaBeginner;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("교환할 돈은? ");
		int exchange = s.nextInt();
		
		System.out.println("500원짜리 : " + exchange/500 + "개");
		exchange %= 500;
		System.out.println("100원짜리 : " + exchange/100 + "개");
		exchange %= 100;
		System.out.println("50원짜리 : " + exchange/50 + "개");
		exchange %= 50;
		System.out.println("10원짜리 : " + exchange/10 + "개");
		exchange %= 10;
		System.out.println("바꾸지 못한 잔돈 : " + exchange + "원");
	}
}
