
import java.util.Scanner;
public class SKIP_NUM
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //this code SKIP num THAT is divide by 10;
        do{
            System.out.print("enter a number: ");
            int n =input.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println("Your number was:- " +n);
            //only print number that isn't divided by 10;
        }while(true);

    }

}

