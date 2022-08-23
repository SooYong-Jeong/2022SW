package java23;

import java.util.Scanner;

public class java23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		  System.out.print("고객의 나이를 입력하세요 : ");
		  int age=sc.nextInt();
		  if (age>=19) {
			  System.out.print("영화를 볼 수 있습니다.");
		  } else if (age<15) {
			  System.out.print("영화를 볼 수 없습니다.");
		  } else {
			  System.out.print("성인이 동반한 경우에만 영화를 볼 수 있습니다.");
		  }
	}

}
