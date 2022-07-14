package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		
		int n=9;
		boolean prime =true;
		for (int i =2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("not A prime number");
				prime = false;
				break;
			}
			
		}
		if(prime==true)
		{
			System.out.println("A prime number");
		}
	}
}
