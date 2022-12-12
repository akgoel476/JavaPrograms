import java.util.Arrays;
public class ArraysMatch {

	public static void main(String[] args)
	{
	ArraysMatch AM=new ArraysMatch();
	int []a= {1,2,3,5};
	int []b= {1,3,4,2};
	
	Arrays.sort(a);
	Arrays.sort(b);
	
	Boolean match=AM.Match(a,b);
	System.out.print(match);
	
	}
	
	public boolean Match(int []a, int []b)
	{
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			continue;
			else
			break;	
		}
	 if(i==a.length)
		 return true;
	else
		return false;
	}

}
