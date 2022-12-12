import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		EvenOdd eo=new EvenOdd();
		
		System.out.print("Enter the First Number: ");
		int a=sc.nextInt();
		System.out.print("Enter the Second Number: ");
		int b=sc.nextInt();
		
		if((a%2==0 && b%2!=0) || (a%2!=0 && b%2==0))
		{
			int c=eo.Multiply(a, b);
			System.out.println(c);
		}
		else
		{
			System.out.print("Invalid Inputs");
		}	

	}
	
	public int Multiply(int a, int b)
	{
		int c=a*b;
		return c;
	}

}
