
import java.util.Scanner;
public class reverse
{
    public static void main(String[] args) {
        System.out.print("enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        while(0<num){
            int rem=num%10;
            System.out.print(rem);
            num = num/10;

        }


    }

}

