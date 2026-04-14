class file{
	public static void main(String[]args)
	{
		int a [][]={{1,2,3},{4,5,6},{7,8,9}};
		int b [][]={{7,3,9},{8,2,3},{1,5,9}};
		int c [][]=new int[3][3];
		
		for(int n=0;n<3;n++)
		{
			for(int i=0;i<3;i++)
			{
				c[n][i]=a[n][i]+b[n][i];
				System.out.print(c[i][n]+ " ");
			}
				System.out.println();
		}
	}
}