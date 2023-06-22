
import java.util.Scanner;
public class reverse_given_NUM
{
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int rev=0;
        while(0<num){
            int lastdigit=num%10;

            rev=(rev*10)+lastdigit;
            num = num/10;

        }
        System.out.print(rev);

    }

}

