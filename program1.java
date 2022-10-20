public class program1
{
	public static void main(String[] args)
	{
		int var=9;
		for(int i=0;i<var;i++)
		{
			for(int j=0;j<var;j++)
			{
				if(i==0||i==(var-1)||j==(var/2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<var;j++)
			{
				if(j==0||j==(var-1)||i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<var;j++)
			{
				if(i==0||j==0||i==(var-1)||i==(var/2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<var;j++)
			{
				if((j==0 && i!=var-1)||(j==var-1 && i!=var-1) || (i==var-1 && j!=0 && j!=var-1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<var;j++)
			{
				if(j==0|| (i==0 && j!=var-1) || (i==var/2 && j!=var-1) ||(i==j && i>=(var/2))
						|| (i>0 && i<var/2 && j==var-1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<var;j++)
			{
				if((i==0 && j!=0 && j!=var-1) || (j==0 && i!=0 && i!=var-1)||
						(j==var-1 && i!=0 && i!=var-1) || (i==var-1 && j!=0 && j!=var-1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<var;j++)
			{
				if(j==0 || j==var-1 || i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
			 
		}
			
		
	}
}