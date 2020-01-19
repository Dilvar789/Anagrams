import java.util.*;
public class Printpythagorastriplet {
	public static void checkpythagoras(int arr[])
	{
		for(int i=0; i<arr.length;i++)
		{
			int x = arr[i];
			for(int j=0; j<arr.length; j++)
			{
				int y= arr[j];
				for(int k=0; k<arr.length; k++)
				{
					int z= arr[k];
					if((z*z)==(x*x + y*y))
					{  
               System.out.println("The Pythagoran Triplets are:");
						   System.out.println(x+", "+y+", "+z);
                return;
					}

				}
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of test cases");
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			System.out.println("Enter the size of the array");
			int size=sc.nextInt();
			int[] a=new int[size];
			for(int j=0;j<size;j++)
			{
				a[j]=sc.nextInt();
			}
			checkpythagoras(a);
		}
	sc.close();
	}
}
