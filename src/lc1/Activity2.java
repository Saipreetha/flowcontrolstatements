package lc1;
import java.util.Scanner;
public class Activity2 {
	public static void main(String args[]){
		int stud[]=new int[3];
		int count=0;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++){
		System.out.print("Enter the marks of the student"+(i+1)+":");
	    stud[i]=scan.nextInt();
        if(stud[i]>=35){
        	count++;
        }
		}
		scan.close();
		System.out.println("the no of students passed in the exam:"+count);
   for(int i=0;i<stud.length;i++){
	   if(stud[i]>=35){
	   System.out.println("the student"+(i+1)+" is pass");
   }
}
}
}