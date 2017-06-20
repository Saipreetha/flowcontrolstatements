package flowcontrolstatements;

public class PrimeArgs {
	public static void main(String args[]){
		int flag=0;
		int num=Integer.parseInt(args[0]);
		if(args[0].length()==0){
			System.out.println("Please enter an integer number ");
		}
		else if(num==0||num==1){
			System.out.println(num+" is neither prime nor composite");
		}
		else if(num>=2){
			for(int num1=2;num1<=(num/2);num1+=2){
				if(num%num1==0){
					System.out.print(num+" is not a prime number");
					flag=1;
					break;
				}
			}
				if(flag==0){
					System.out.print(num+" is a prime number");
				}

		}
	}

}
