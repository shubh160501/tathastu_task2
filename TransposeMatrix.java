class TransposeMatrix{
	public static int[][] transpose(int a[][],int rowCount,int colCount)
	{
		int result[][] = new int[colCount][rowCount];
		System.out.println(rowCount);
		System.out.println(colCount);
		for(int i=0;i<colCount;i++)
		{
			for(int j=0;j<rowCount;j++)
			{
				result[i][j] = a[j][i];
			}
		}
		return result;
	}
	public static void main(String[] args){
		 int a[][] = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}};
        int rowCount = a.length;
		int colCount = a[0].length;
        int result[][] = transpose(a,rowCount,colCount);
        System.out.print("Result matrix is \n");
        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < result[0].length; j++)
            System.out.print(result[i][j] + " ");
            System.out.print("\n");
        }
	}
}