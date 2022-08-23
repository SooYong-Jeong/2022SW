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

		System.out.print("�л���>> ");
		int studentCount = s.nextInt();
		StudentNumber[] student = new StudentNumber[studentCount];

		for(int i = 0; i < student.length; i++) {
			System.out.print("�⼮��ȣ[" + (i+1) + "] �л� �̸�/�й� : ");
			String name = s.next();
			String number = s.next();
			student[i] = new StudentNumber(name, number);
		}
		System.out.println("������ ��Ĩ�ϴ�.");
		System.out.println("      �й��˻��ý���      ");
		while(true) {
			System.out.println("----------------------");
			System.out.println("  1: �˻�   |   2: ���� ");
			System.out.println("----------------------");
			System.out.print(">> ");
			int flag = s.nextInt();

			if(flag == 1) {
				System.out.print("ã������ �л��� �̸�>> ");
				String search = s.next();
				int searchStudent = -1;
				for(int i = 0; i < student.length; i++) {
					if(student[i].name.equals(search)) {
						searchStudent = i;
					}
				}
				if(searchStudent != -1)
					System.out.println("[ �⼮��ȣ " + (searchStudent+1) + " : "+ student[searchStudent].name + " | " + student[searchStudent].number + "]");
				else
					System.out.println("[" + search + "]" + "�л��� �����ϴ�.");
			}
			else if(flag == 2) {
				System.out.println("�����մϴ�.");
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
