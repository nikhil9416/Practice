import java.io.*;

class MatrixRotate {

	
	
	static int[][] Rotate(int [][]arr,int row,int column,int flag)
	{
		int Tarr[][];
			
		int p=0,k=0;
	
		if(flag==0)
		{
			Tarr=new int[row][column];
			for(int i=row-1;i>=0;i--)
			{
				for(int j=0;j<column;j++)
				{
					//System.out.print(" "+arr[j][i]+" ");
					Tarr[p][k]=arr[j][i];
					k++;	
				}
				k=0;
				p++;
				System.out.println("");
			}
			
			return Tarr;
		}
		else if(flag==1)
		{
			
			Tarr=new int[row][column];

			for(int i=0;i<row;i++)
			{
				for(int j=column-1;j>=0;j--)
				{
					//System.out.print(" "+arr[j][i]+" ");
					Tarr[p][k]=arr[j][i];
					k++;
				}
				k=0;
				p++;
				System.out.println("");
			}
		
			return Tarr;
		} 
		else {
			return arr;
		}
	}
	
		
	static void show(int arr[][],int row,int column)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			System.out.print(" "+arr[i][j]+" ");

			System.out.println("");
		}
		
		System.out.println("");
	}

	
	public static void main(String args[])
	{
		
		int arr[][]=new int[3][3];
		int row=3,column=3;
			
		Console con=System.console();
	
		System.out.println("Enter value");		

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			arr[i][j]=Integer.parseInt(con.readLine());

		}
		
		show(arr,row,column);

		arr=Rotate(arr,row,column,0);
		
		show(arr,row,column);

		arr=Rotate(arr,row,column,1);

		show(arr,row,column);
		
		arr=Rotate(arr,row,column,1);

		show(arr,row,column);

		arr=Rotate(arr,row,column,1);

		show(arr,row,column);
	}
}
	