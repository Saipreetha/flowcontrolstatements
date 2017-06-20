package lc3;
import java.util.Scanner;
public class Activity4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the number of students");
		int num=s.nextInt();
		int count;
		System.out.println("Enter the score");
		int[] arr=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=s.nextInt();
			}
		s.close();
		
		for(int i=0;i<=100;i++){
			count=0;
			for(int j=0;j<num;j++){
				
				if(arr[j]==i){
					count++;	
				}
			}
			System.out.println("The student count for score"+i+"is "+count);
				
			
		}
	}

}
