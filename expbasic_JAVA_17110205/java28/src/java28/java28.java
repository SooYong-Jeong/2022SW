package java28;
import java.util.Scanner;
import java.util.Random; 

public class java28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("해당 월의 영어 단어를 입력하시오.");
		  System.out.println("첫글자는 대문자, 나머지는 소문자로 입력하세요.");
		  int[] arr = new int[12]; 
		  Random rd = new Random();
		  String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		  int temp = -1;
		  while(true) {
			  int a = rd.nextInt(12);
			  
			  if (a==temp) {
				  continue;
			  }
			  temp = a;
			  System.out.println(a+1+"월 : ");
			  String ans=sc.nextLine();
			  if (ans.equals(month[a])) {  
			  } else {
				  while (true) {
					  System.out.println("틀렸습니다.");
					  System.out.println(a+1+"월 : ");
					  String ans1=sc.nextLine();
					  if (ans1.equals(month[a])) { 
						  break;
					  }  
				  }  
			  }
			  System.out.println("정답입니다. 다시 한번? 1..Yes/0..No : ");
			  String re=sc.nextLine();
			  if (re.equals("0") || re.equals("No") ) {
				break;
			  }
		  }

	}

}
