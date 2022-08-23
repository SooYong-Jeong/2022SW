package javaBeginner;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("상품금액 입력 : ");
			String str = s.next();
			if(str.equals("끝"))
				break;
			else
				sum += Integer.parseInt(str);			
		}
		System.out.println("구매하신 상품들의 총 가격은 " + sum + "입니다.");
	}
}
