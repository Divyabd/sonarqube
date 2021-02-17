package practice13;

import set1.util.ScannerValidate;

public class matrixMultiplication {

	public static void main(String[] args) {
	System.out.println("please enter the size of the matrix");
	int size=ScannerValidate.getInt();
		int[][] matrixA=new int[size][size];
		int[][] matrixB=new int[size][size];
System.out.println("enter the mElements for matrix A");
for(int row=0;row<size;row++)
{
	for(int col=0;col<size;col++)
	{
		matrixA[row][col]=ScannerValidate.getInt();
	}
}
for(int row=0;row<size;row++)
{
	for(int col=0;col<size;col++)
	{
		matrixB[row][col]=ScannerValidate.getInt();
	}
}
int[][] matrixC=new int[size][size];
for(int row=0;row<size;row++)
{
	for(int col=0;col<size;col++)
	{
		for(int k=0;k<size;k++)
		{
		matrixC[row][col]=matrixA[row][col]+matrixA[row][col]*matrixB[row][col];
		}
	}
}


for(int row=0;row<size;row++)
{
	for(int col=0;col<size;col++)
	{
		System.out.print(matrixA[row][col]+"\t");
	}
	System.out.println("");
}		
		
	}

}
