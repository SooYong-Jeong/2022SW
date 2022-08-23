package java29;
import java.util.Scanner;
public class java29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.print("사람의 수는 :");
		  int num=sc.nextInt();
		  System.out.println(num+"명의 신장과 체중을 입력하자.");
		  int[] weight = new int[num];
		  int[] height = new int[num];
		  for(int i=0; i<num; i++)
		    {
			  System.out.print(i+1+"명의 신장 :");
			  int hei=sc.nextInt();
			  System.out.print(i+1+"명의 체중 :");
			  int wei=sc.nextInt();
			  weight[i] = wei;
			  height[i] = hei;
		    }
		  System.out.println("가장 키가 작은 사람의 신장 : "+minOf(height,num)+"cm");
		  System.out.println("가장 마른 사람의 체중 : "+minOf(weight,num)+"kg");
		  
	} 
 static int minOf(int[] a,int num)//여기가 최소값 구하는 메소드
    {
	 var min = a[0];
	for(int i=1; i<num; i++)//a배열의 길이만큼 반복
    {
	if (a[i] < min)
	{
		min = a[i];
	}
	}
	 return min;
    }
}
