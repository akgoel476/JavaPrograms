import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int []a= {1,4,5,6,7,8};
		System.out.print("Enter the Number: ");
		int number=sc.nextInt();
		int i;
		for(i=0;i<a.length;i++)
		{
			if(number==a[i])
			{
				System.out.print("Number is Present");
				break;
			}
		}
		
		if(i==a.length)
			System.out.print("Number is not Present");
     }

}
