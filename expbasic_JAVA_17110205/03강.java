package javaBeginner;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("세 개의 정수를 입력하세요");
		int number_1 = s.nextInt();
		int number_2 = s.nextInt();
		int number_3 = s.nextInt();
		int max, min;
		
		if(number_1 > number_2) {
			max = number_1;
			min = number_2;
		}
		else {
			max = number_2;
			min = number_1;
		}
		if(number_3 > max)
			max = number_3;
		if(number_3 < min)
			min = number_3;
		
		System.out.println("최대값은 " + max + " 이다.");
		System.out.println("최소값은 " + min + " 이다.");
	}
}
