package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int j = 1;
		int fact = 5;
		
		for (int i = 1; i <=fact ; i++) {
			
			j = i * j;	
		}
		System.out.println(j);
	}

}
