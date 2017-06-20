package flowcontrolstatements;
import java.util.Scanner;
public class menu {
	public static void main(String args[]){
		char ch;
		System.out.print("Menu\n1.Add\n2.Sub");
		Scanner scan=new Scanner(System.in);
		int option=scan.nextInt();
		
		do{
			if(option<=2){
				System.out.print("Enter the two values");
				int num1=scan.nextInt();
				int num2=scan.nextInt();
			      switch(option){
			      case 1:
			    	  System.out.print("addition of the two values:"+(num1+num2));
			    	  break;
			      case 2:
			    	  System.out.print("subraction of the two values:"+(num1-num2));
			      }
			}
			System.out.println("if you want to continue:y/n");
			 ch=scan.next().charAt(0);
			 
		}while(ch=='y'||ch=='Y');
		
	}
}
