package flowcontrolstatements;
import java.util.Scanner;
public class color {
	public static void main(String args[]){
		System.out.print("Enter the code R,B,O,G,W,Y:");
		Scanner scan=new Scanner(System.in);
		char code=scan.next().charAt(0);
		scan.close();
		switch(code){
		case 'R':
			System.out.print("Red");
			break;
		case 'B':
			System.out.print("Blue");
			break;
		case 'O':
			System.out.print("Orange");
			break;
		case 'G':
			System.out.print("Green");
			break;
		case 'W':
			System.out.print("White");
			break;
		case 'Y':
			System.out.print("Yellow");
			break;
		default:
			System.out.print("Invalid");
			break;
		}
	}
}
