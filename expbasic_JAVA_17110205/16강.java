package javaBeginner;

import java.util.Scanner;

class Student{
	String name;
	String department;
	int grade;
	
	Student(String name, String department, int grade){
		this.name = name;
		this.department = department;
		this.grade = grade;
	}
	public String toString() {
		return "[�̸� : " + name + " | " + "�а� : " + department + " | " +"�г� : " + grade + "]";
	}
}

public class Task16 {
	public static void main(String[] args) {
		Student student1 = new Student("�ֿ��", "��ǻ�� ���а�", 2);
		Student student2 = new Student("�̼���", "�����", 4);
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		student2.department = "�濵�а�";
		System.out.println(student2.toString());
	}
}
