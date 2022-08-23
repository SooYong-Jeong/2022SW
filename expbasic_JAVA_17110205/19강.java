package javaBeginner;

import java.util.Scanner;

class StudentNumber{
	String name;
	String number;

	StudentNumber(String name, String number){
		this.name = name;
		this.number = number;
	}
}

class Operate{
	public void operate(){
		Scanner s = new Scanner(System.in);

		System.out.print("학생수>> ");
		int studentCount = s.nextInt();
		StudentNumber[] student = new StudentNumber[studentCount];

		for(int i = 0; i < student.length; i++) {
			System.out.print("출석번호[" + (i+1) + "] 학생 이름/학번 : ");
			String name = s.next();
			String number = s.next();
			student[i] = new StudentNumber(name, number);
		}
		System.out.println("편집을 마칩니다.");
		System.out.println("      학번검색시스템      ");
		while(true) {
			System.out.println("----------------------");
			System.out.println("  1: 검색   |   2: 종료 ");
			System.out.println("----------------------");
			System.out.print(">> ");
			int flag = s.nextInt();

			if(flag == 1) {
				System.out.print("찾으려는 학생의 이름>> ");
				String search = s.next();
				int searchStudent = -1;
				for(int i = 0; i < student.length; i++) {
					if(student[i].name.equals(search)) {
						searchStudent = i;
					}
				}
				if(searchStudent != -1)
					System.out.println("[ 출석번호 " + (searchStudent+1) + " : "+ student[searchStudent].name + " | " + student[searchStudent].number + "]");
				else
					System.out.println("[" + search + "]" + "학생은 없습니다.");
			}
			else if(flag == 2) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}

public class Task19 {
	public static void main(String[] args) {
		Operate o = new Operate();
		o.operate();
	}
}
