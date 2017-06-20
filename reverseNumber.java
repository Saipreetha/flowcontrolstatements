package flowcontrolstatements;
import java.util.Scanner;
public class reverseNumber {
	public static void main(String args[]){
		int temp=0,tot=0;
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		while(num!=0){
			temp=num%10;
			tot=tot*10+temp;
			num=num/10;
		}
		System.out.print(tot);
	}

}
