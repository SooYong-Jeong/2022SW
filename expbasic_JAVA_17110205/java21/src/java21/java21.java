package java21;

public class java21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a = 35;
		int b = 85;
		int c = 45;
		var temp = 0;
		System.out.println("정수 a : " + a);
		System.out.println("정수 b : " + b);
		System.out.println("정수 c : " + c);
		System.out.println("a <= b <= c 가 되도록 정렬했습니다.");
		if (a >= b) {
			temp = a;
			a = b;
			b = temp;
			
		}
		if (a>=c) {
			temp = a;
			a = c;
			c = temp;
		}
		if (b>=c) {
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println("변수는 a는 "+a+"입니다.");
		System.out.println("변수는 b는 "+b+"입니다.");
		System.out.println("변수는 c는 "+c+"입니다.");
	
	}

}
