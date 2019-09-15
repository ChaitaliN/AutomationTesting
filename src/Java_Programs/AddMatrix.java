package Java_Programs;

public class AddMatrix {

	public static void main(String[] args) {
		// add two matrices
		
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		System.out.println(a.length);
		
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};
		
		int res[][]=new int[3][3];
		
		System.out.println("Matrix a is: ");
		for (int r=0;r<a.length;r++)
		{
			for (int c=0;c<a.length;c++)
			{
				System.out.print(" "+a[r][c]);
			}
			System.out.println();

		}
		
		for (int row=0;row<a.length;row++)
		{
			for (int col=0;col<a.length;col++)
			{
				res[row][col]=a[row][col]+b[row][col];
			}
		}

		for (int r=0;r<a.length;r++)
		{
			for (int c=0;c<a.length;c++)
			{
				System.out.print(" "+res[r][c]);
			}
			System.out.println();

		}
		
		System.out.println("transpose of matrix");

		for (int r=0;r<a.length;r++)
		{
			for (int c=0;c<a.length;c++)
			{
				System.out.print(" "+res[c][r]);
			}
			System.out.println();

		}
		
	}

}
