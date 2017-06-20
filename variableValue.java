package flowcontrolstatements;
import java.util.Scanner;
public class variableValue {
	public static void main(String args[]){
		System.out.print("Enter the variable");
		Scanner scan=new Scanner(System.in);
		char n=scan.next().charAt(0);
		scan.close();
		if((n>='a'&&n<='z')||(n>='A'&&n<='Z')){
			System.out.print("Alphabet");
		}
		else if(n>='1'&&n<='9'){
			System.out.print("Digit");
		}
		else{
			System.out.print("Special Characer");
		}
	}

}
