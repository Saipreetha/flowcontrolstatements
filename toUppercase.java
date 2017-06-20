package flowcontrolstatements;
import java.util.Scanner;
public class toUppercase {
	public static void main(String args[]){
		int temp;
		char alphabet;
		System.out.println("Enter the character");
		Scanner scan=new Scanner(System.in);
		char alpha=scan.next().charAt(0);
		scan.close();
		temp=alpha;
		if(alpha>='a'&&alpha<='z'){
		        temp = temp - 32;
		        alphabet = (char) temp;
		        System.out.print(alpha+"->"+alphabet);
		}
		else{
			temp=temp+32;
			alphabet=(char)temp;
	        System.out.print(alpha+"->"+alphabet);

		}
	}
}
