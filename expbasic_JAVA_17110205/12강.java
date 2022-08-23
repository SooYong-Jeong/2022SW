package javaBeginner;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] array = new int[10];
		double sum = 0;
		for(int i = 0; i < 10; i++) {
			System.out.print("[" + (i+1) + "]정수를 입력하세요: ");
			array[i] = s.nextInt();
			sum += array[i];
		}
		System.out.println("----------------------------");
		System.out.println("합 = " + sum);
		System.out.println("평균 = " + sum /10);
	}
}
