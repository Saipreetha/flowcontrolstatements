package lc3;
import java.util.Scanner;
public class Activity1 {
	public static void main(String[] args)
	{
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the ten integers");
		int a[]=new int[10];
		for(int i=0;i<10;i++)
		{
		 a[i]=scan.nextInt();
		sum=sum+a[i];
		}
		scan.close();
		System.out.println("the sum of all the elements are:"+sum);
	}
}
