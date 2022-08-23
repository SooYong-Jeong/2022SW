package javaBeginner;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int order = 0;
		int number;
		int[] myLotto = new int[6];
		int[] lotto = new int [7];
		int[] result = new int[6];
		int count, check;

		System.out.println("\t\t\t====로또시스템===");
		System.out.println("\n(1~45사이의 수를 입력하세요)");

		while(order < 6) {
			check = 1;

			System.out.printf("[%d] 번호 입력 : ", order+1);
			number = sc.nextInt();

			for(int i =0; i < 6; i++) {
				if(number == myLotto[i]) {
					check = 0;
					break;
				}
			}
			if(check !=0) {
				myLotto[order] = number;
				order++;
			}else {
				System.out.println("중복된 번호입니다. 다시 입력");
			}
		}
		System.out.print("\n당신의 선택은>");
		for(int i =0; i < myLotto.length; i++) {
			System.out.print(myLotto[i] + " ");
		}
		for(int i = 0; i< lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
		}
		System.out.print("\n\n이번회차 당첨 결과는 ");

		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.printf(" + 보너스 번호 %d 입니다. \n", lotto[6]);

		count = 0;
		for(int i = 0; i < 6; i++)
			for(int j = 0; j < 7; j++)
				if(myLotto[i] == lotto[j]) {
					result[count]= myLotto[i];
					count++;
				}

		System.out.printf("당점번호갯수 : %d\n", count);
		if(count>0) {
			System.out.print("당첨번호는 ");
			for(int i= 0; i < count; i++)
				System.out.print(result[i] + " ");
			System.out.println("입니다.");
		}

		if(count == 6) {
			if(result[count] == lotto[5])
				System.out.println("\n 당첨결과는 1등입니다.");
			else
				System.out.println("\n 당첨결과는 2등입니다.");
		}
		else if(count == 5)
			System.out.println("\n 당첨결과는 3등입니다.");
		else if(count == 4)
			System.out.println("\n 당첨결과는 4등입니다.");
		else if(count == 3)
			System.out.println("\n 당첨결과는 5등입니다.");
		else	
			System.out.println("\n 당첨결과는 꽝입니다.");
	}
}



