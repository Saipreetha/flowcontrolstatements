package flowcontrolstatements;



public class primeNumber10to90 {
	public static void main(String args[]){
		int flag=0;
		for(int num = 10; num <= 90; num++){
            for(int num1 = 2; num1 < num/2; num1++){
                if(num % num1 == 0){
                    flag = 0;
                    break;
                }
                else{
                    flag = 1;
                }
            }
            if(flag == 1){
                System.out.println(num);
            }
        }
   }

}

