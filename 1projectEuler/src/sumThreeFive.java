
public class sumThreeFive {


	public static void main(String[] args)
	{
		int result = 0, x = 1000;
		
		for(int i = 1; i < x; i++)
		{
			if(i % 3 == 0)
			{
				if(i % 5 == 0)
					result += i;
				else
				    result += i;
			}		
			else if(i % 5 == 0)
				result += i;
		}
		System.out.println(result);
	}
}
