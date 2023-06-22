import java.util.Scanner;
public class Whileloop {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("enter a number:- ");
        int num = input.nextInt();

        int i=1;
        while(i<=num){
            System.out.print(i);
            i++;
        }


    }
}
