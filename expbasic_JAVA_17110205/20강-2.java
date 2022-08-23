package javaBeginner;

import java.util.Scanner;

public class ConsertExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Consert consert = new Consert();
		System.out.println("콘서트홀 예약 시스템");
		boolean flag = true;

		while(flag) {
			System.out.print("예약:1 | 조회:2 | 취소:3 | 끝내기:4 >>");
			int choose= sc.nextInt();

			switch(choose) {
			case 1:
				System.out.print("좌석 구분 S(1), A(2), B(3)>>");
				int seatNum = sc.nextInt();
				consert.book(seatNum);
				break;
			case 2:
				consert.showAll();
				System.out.println();
				break;
			case 3:
				System.out.println("좌석 S:1, A:2, B:2>>");
				int seatNum1 = sc.nextInt();
				consert.cancel(seatNum1);
				break;
			case 4:
				flag= false;
			}
		}
		sc.close();
	}
}
