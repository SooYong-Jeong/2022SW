package java27;
import java.util.Scanner;
import java.util.Random;
public class java27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println(items[rand.nextInt(5)]);
		  int sum = 0;
		  while(true) {
			  System.out.print("손님의 이름을 입력하세요 : ");
			  String name=sc.next();
			  System.out.print("요금을 입력하세요 : ");
			  int money=sc.nextInt();
			  sum += money;
			  if (name.equals("길동")) {
				  System.out.println("\n총 수입은 "+sum+"이다.");
				  break;
			  }
			  
			  
			  
		  }

		  
		  
		  
		  

	}

}
