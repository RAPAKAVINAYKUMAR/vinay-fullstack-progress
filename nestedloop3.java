class Nestedloop3 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.print(",");
		}
	}
}
