import java.util.*;
class Array1DSumOddEven
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Array Element=");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter "+n+" Elements=");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int oddsum=0,evensum=0;
		System.out.println("Array Elements are=");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
				evensum=evensum+arr[i];
			else
				oddsum=oddsum+arr[i];
		}
		System.out.print("Sum of Odd="+oddsum+" Sum of Even="+evensum);
	}
}
			