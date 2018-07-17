package oca.javaarrays;
import java.util.Arrays;
public class AddMat 
{
	public static void main(String[] args)
	{
		int[][] a={{12,4,16},{11,5,40},{40,65,3}};
		int[][] b= {{12,4,16},{11,5,40},{40,65,3}};
		int[][] c=new int[3][3];//creation of array
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println(Arrays.deepToString(c));//for returning string representation of contents of array
		
	}

}
