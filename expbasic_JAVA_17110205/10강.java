package javaBeginner;

public class Task10 {
	public static void main(String[] args) {
		int[] array = {20,50,55,-7,30,57};
		
		int max = array[0];
		int min = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max)
				max = array[i];
			if(array[i] < min)
				min = array[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
