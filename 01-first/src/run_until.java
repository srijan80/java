
import java.util.Scanner;
public class run_until
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //this code run until num isn't divide by 10;
        do{
            System.out.print("enter a number: ");
            int n =input.nextInt();
            if(n%10==0){
                System.out.println("done "+ n);
                break;
            }
            System.out.println(n);
        }while(true);

    }

}

