package javaBeginner;

public class Task11 {
	public static void main(String[] args) {
		char[] array = new char[26];
		
		for(int i = array.length; i > 0; i--) {
			array[array.length - i] = (char)(96+i);
		}
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}
