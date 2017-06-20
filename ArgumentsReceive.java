package flowcontrolstatements;

public class ArgumentsReceive {
	public static void main(String args[]){
		if(args.length==0){
			System.out.print("No value");
		}
		else {
			System.out.print(args[0]+","+args[1]);
			
		}
	}

}
