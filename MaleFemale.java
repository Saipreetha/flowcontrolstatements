package flowcontrolstatements;

public class MaleFemale {
	public static void main(String [] args){
		int age=Integer.parseInt(args[1]);
	    if(args[0].equals("male")&&(age>=1&&age<=60)){
	    	System.out.print("Interest == 9.2% ");
	    }
	    if(args[0].equals("male")&&(age>=61&&age<=120)){
	    	System.out.print("Interest == 8.3%  ");
        }
	    if(args[0].equals("female")&&(age>=59&&age<=120)){
	    	System.out.print("Interest == 7.6% 	  ");
	    }
	    if(args[0].equals("female")&&(age>=1&&age<=58)){
	    	System.out.print("Interest == 8.2% ");
	    }


   }
}