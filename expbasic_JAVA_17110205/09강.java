package javaBeginner;

public class Task09 {
	public static void main(String[] args) {
		int[] array = {20, 50, 55, -7, 30, 57};
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 30)
				System.out.println("30인 곳의 인덱스 : " + i);
		}
	}
}
