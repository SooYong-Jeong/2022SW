package java22;
import java.util.Scanner;
public class java22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현 연봉을 입력하세요 : ");
		  int Salary= sc.nextInt();
		  System.out.print("근무 평가등급을 입력하세요 : ");
		  int rank = sc.nextInt();
		  
		  double plus=0.0;
		 
		  if (num ==1) {
			  plus = Salary * 0.06;
			  
		  } else if (num==2) {
			  plus = Salary * 0.04;
		  }else {
			  plus = Salary * 0.02;
			  
		  } 
		  double newSalary=plus+Salary;
		  System.out.println("연봉인상액:"+plus);
		  System.out.print("새 연봉: "+newSalary);

	}

}
