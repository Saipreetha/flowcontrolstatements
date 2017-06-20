package lc1;
import java.util.Scanner;
public class Activity5 {
    public static void main(String[] args) 
    {
        int  sum = 0;
        Scanner s = new Scanner(System.in);
        int a[] = new int[3];
        System.out.println("Enter three elements:");
        for(int i = 0; i < 3 ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        s.close();
    }
}





