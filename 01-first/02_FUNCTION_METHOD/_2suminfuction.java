import java.util.Scanner;
public class _2suminfuction {
    public static int sum(){
        Scanner input = new Scanner (System.in);
        System.out.print("enter a number: ");
        int num1 = input.nextInt();

        System.out.print("enter a number: ");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.print(num1+ " + "+ num2+" = "+ sum);
        return 1;
    }
    public static void main (String []args){
        sum();

    }
}
