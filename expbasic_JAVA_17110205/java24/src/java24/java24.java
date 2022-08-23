package java24;

import java.util.Scanner;

public class java24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  
		  
		  System.out.println("숫자 피라미드를 표시합니다.");
		  System.out.print("단수는?");
		  int num=sc.nextInt();
		  
		  for(int i=0;i<num;i++){
				for(int j=0;j<num-i;j++){
					System.out.print(" "); 
				}
				for(int j=0;j<2*i+1;j++){
					System.out.print(i+1); 
				}
				System.out.println("");
			} 

	}

}
