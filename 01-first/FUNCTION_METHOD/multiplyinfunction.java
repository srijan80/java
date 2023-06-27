import java.util.*;
public class multiplyinfunction {

    public static int multiply(int num1, int num2){
        int product =num1*num2;
        return product;
    }

    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.print("enter a number: ");
        int num1 = input.nextInt();
        System.out.print("enter a number: ");
        int num2 = input.nextInt();
        int prod=multiply(num1,num2);
        System.out.print(prod);

    }
}
