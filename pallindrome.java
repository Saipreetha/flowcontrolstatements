package flowcontrolstatements;
import java.util.Scanner;
public class pallindrome {
	public static void main(String args[]){
		int temp=0,tot=0,numb;
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		numb=num;
		while(num!=0){
			temp=num%10;
			tot=tot*10+temp;
			num=num/10;
		}
		if(tot==numb){
			System.out.print(numb+" is a Pallindrome");
		}
		else{
			System.out.print(numb+" is not a Pallindrome");
		}
	}

}
