package lc4;
import java.util.Scanner;
public class Activity4 {
	public static void main(String args[]){
	System.out.println("Enter the String");
	Scanner scan=new Scanner(System.in);
	String original=scan.nextLine();
	scan.close();
	int count;
    char ch;
    char ch1;
    for(ch='a';ch<='z';ch++){
    	count=0;
    for(int i=0;i<original.length();i++){
          ch1=original.charAt(i);
          if(ch==ch1){
                      count++;
          }
    }
    if(count>0){
         System.out.println(ch+" "+count);
    }
    
}
}
}