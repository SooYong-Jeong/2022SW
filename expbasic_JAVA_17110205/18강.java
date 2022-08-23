package javaBeginner;

import java.util.Scanner;

class CalcBMI{
	double height;

	public void convertHeight(int height) {
		this.height = (double)(height * 0.01);
	}

	public double man() {
		return height * height * 22;
	}

	public double woman() {
		return height * height * 21;
	}
}


public class Task18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CalcBMI calc = new CalcBMI();

		System.out.print("키를 입력하세요 : ");
		calc.convertHeight(s.nextInt());

		System.out.print("성별을 입력하세요 (남/여) : ");
		String input = s.next();

		char gender = input.charAt(0);
		if(gender == '남'){
			System.out.printf("남자인 당신의 표준 체중은 ");
			System.out.printf("%.1f", calc.man());
			System.out.println("입니다.");
			}
		else if(gender == '여') {
			System.out.printf("여자인 당신의 표준 체중은 ");
			System.out.printf("%.1f", calc.woman());
			System.out.println("입니다.");
			}

	}
}
