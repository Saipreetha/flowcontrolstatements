package guvitest;
import java.util.Scanner;
public class countingpri {
	public static void main(String args[]){
		System.out.print("Enter the starting number and ending number");
		Scanner scan=new Scanner(System.in);
		int input1=scan.nextInt();
		int input2=scan.nextInt();
		int flag;
		scan.close();
		int count=0;
		for(int i=input1;i<=input2;i++){
			flag=0;
			 for(int j=2;j<i;j++){    
				   if(i%j==0){       
				   flag=1;        
				   }
				  }
			 if(flag==0){
				 count++;
			 }
			}  
		System.out.print(count);
		}
	}


