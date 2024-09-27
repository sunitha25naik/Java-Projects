//Matrix addition

class rowaddition
{
 public static void main(String args[])
  {	
	int i,j,sum=0;
    int[][] matrix = {
            {1, 2}, 
            {4, 5, 6}, 
            {7,1,2,1}, 
         };
	System.out.println("-----------Addition of each row------");

    for(i=0;i<matrix.length;i++)
	{
      sum=0;
		for(j=0;j<matrix[i].length;j++)
		{
			sum=sum+matrix[i][j];
		}
	   System.out.println(sum+"\n");
	 }
  }
}