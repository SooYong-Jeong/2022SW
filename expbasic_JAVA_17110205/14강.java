package javaBeginner;

import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String accessCode = "sa7946";

		int[] sales = new int[5];
		int errorCount = 0;
		int sum = 0;

		System.out.println("==============매출입력시스템=============");
		while(true) {
			System.out.print("접속코드를 입력하세요 : ");
			String input = s.nextLine();

			if(input.equals(accessCode)) {
				System.out.println("--시스템에 접속하였습니다.--");

				for(int i = 0; i < sales.length; i++) {
					System.out.print("판매원의 번호> ");
					if(s.nextInt() == (i+1)) {
						System.out.print("판매원 " + (i+1) + "의 매출액> ");
						sales[i] = s.nextInt();
					}
				}
				
				int max = sales[0];
				int min = sales[0];
				int maxid = 0, minid = 0;
				
				for(int i = 0; i < sales.length; i++) {
					sum += sales[i];
					if(sales[i] >= max) {
						maxid = i+1;
						max = sales[i];
					}
					if(sales[i] <= min) {
						minid = i+1;
						min = sales[i];
					}
				}

				System.out.println();
				System.out.println("판매원들의 매출액");
				System.out.println("------------------------------------------");
				for(int i = 0; i < sales.length; i++)
					System.out.println("판매원 " + (i+1) + "\t\t" + sales[i]);
				System.out.println("총 매출액 : " + sum);
				System.out.println("평균 매출액 : " + (double)(sum / sales.length));
				System.out.println("최대 매출액 : " + max + "(판매원 " + maxid + ")");
				System.out.println("최소 매출액 : " + min + "(판매원 " + minid + ")");
				break;
			}
			else {
				errorCount++;
				if(errorCount == 3) {
					System.out.println("접속을 거부합니다");
					break;
				}
				System.out.println("접속코드를 재확인하세요");
			}
		}
	}
}
