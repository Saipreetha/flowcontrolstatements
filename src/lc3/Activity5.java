package lc3;

import java.util.Scanner;

public class Activity5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the number of students");
		int num=s.nextInt();
		int count=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int count9=0;
		int count10=0;
		System.out.println("Enter the score");
		int[] arr=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=s.nextInt();
			}
		s.close();
      for(int i=0;i<num;i++){
    	  if(arr[i]>=1&&arr[i]<=10){
    		  count++;
    	  }
    	  else if(arr[i]>=11&&arr[i]<=20){
    		  count2++;
    	  }
    	  else if(arr[i]>=21&&arr[i]<=30){
    		  count3++;
    	  }
    	  else if(arr[i]>=31&&arr[i]<=40){
    		  count4++;
    	  }
    	  else if(arr[i]>=41&&arr[i]<=50){
    		  count5++;
    	  }
    	  else if(arr[i]>=51&&arr[i]<=60){
    		  count6++;
    	  }
    	  else if(arr[i]>=61&&arr[i]<=70){
    		  count7++;
    	  }
    	  else if(arr[i]>=71&&arr[i]<=80){
    		  count8++;
    	  }
    	  else if(arr[i]>=81&&arr[i]<=90){
    		  count9++;
    	  }
    	  else if(arr[i]>=91&&arr[i]<=100){
    		  count10++;
    	  }
      }
      System.out.println("0 to10%"+" "+count+"\n"+"11 to 20%"+" "+count2+"\n"+"21 to 30%"+" "+count3+"\n"+"31 to 40%"+" "+count4+" \n"+"41 to 50%"+" "+count5+"\n"+"51 to 60%"+" "+count6+"\n"+"61 to 70%"+" "+count7+"\n"+"71 to80%"+" "+count8+"\n"+"81 to 90%"+" "+count9+"\n"+"91 to 100%"+" "+count10);
		
}
}