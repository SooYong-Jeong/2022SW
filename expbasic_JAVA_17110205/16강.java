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
		return "[이름 : " + name + " | " + "학과 : " + department + " | " +"학년 : " + grade + "]";
	}
}

public class Task16 {
	public static void main(String[] args) {
		Student student1 = new Student("최우식", "컴퓨터 공학과", 2);
		Student student2 = new Student("이서진", "건축과", 4);
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		student2.department = "경영학과";
		System.out.println(student2.toString());
	}
}
