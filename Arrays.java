import java.util.Scanner;

public class Arrays {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Arrays ar=new Arrays();
		int[] array= {5,1,7,4,2};
		System.out.print("Input the Order: ");
		String input=sc.nextLine();
		
		if(input.contains("Decending"))
		{
			int []b=ar.Decending(array);
			for(int i=0;i<b.length;i++)
				System.out.print(b[i]+" ");
		}
		else if(input.contains("Ascending"))
		{
			int[] b=ar.Ascending(array);
			for(int i=0;i<b.length;i++)
				System.out.print(b[i]+" ");
		}
	}
	
	public int[] Ascending(int []a)
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	
	public int[] Decending(int []a)
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}


}
