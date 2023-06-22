
import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args) {
        System.out.print("enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int sum=1,i=1;
        while(i <= num){
            sum=sum*i;
            i++;
        }
        System.out.println("factorial is "+ sum);
    }
}
