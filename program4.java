public class program4
{
	public static void main(String[] args)
	{
		int var=14;
		for(int i=0;i<var;i++)
		{
			for(int j=0;j<var; j++)
			{
				if((j==0) && (i>=(var-1)/2)|| i==var-1 || (j==(var-1)) && (i>=(var-1)/2) ||
					(i-j>=(var-1)/2) || (i+j>=(var+(var-3)/2))
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