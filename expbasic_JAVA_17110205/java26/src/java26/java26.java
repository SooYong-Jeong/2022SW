package java26;
import java.util.Scanner;
public class java26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.print("원금을 입력하세요: ");
		  int m=sc.nextInt();
		  System.out.print("연이율을 입력하세요: ");
		  double year=sc.nextInt();
		  int i = 1;
		  double temp = m;
		  double newm;
		  System.out.println("연도수			원리금");
		  while (true) {
		 newm =temp*(1+(year/100));
		 temp = newm;
		 System.out.println(i+"			"+newm);
		
		if (newm>m*2) {
			 System.out.println("필요한 연도수 = "+i);
			 break;
		} 
		i ++;
			  
		  
		  }
	}

}
