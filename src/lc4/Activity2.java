package lc4;
import java.util.Scanner;
public class Activity2 {
		public static void main(String args[]){
			System.out.print("Enter the String");
			Scanner scan=new Scanner(System.in);
			String original=scan.nextLine();
			scan.close();
			String strA=original.replaceAll("[aeiouAEIOU]","z");
			System.out.print(strA);
			}
		}


