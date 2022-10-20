public class program5
{
	public static void main(String[] args)
	{
		int var=14;
		for(int i=0;i<var;i++)
		{
			for(int j=0;j<var; j++)
			{
				if(i==0 || j==0 || i==(var-1) || (i+j<=((var-1)/2)) || (i-j>=((var-1)/2))
						 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			
			
		}
	}
}
