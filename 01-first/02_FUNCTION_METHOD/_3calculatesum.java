import java.util.*;
public class _3calculatesum {
    public static void call(int num1,int num2){
        int sum = num1 + num2;
        System.out.println(num1+" + "+num2+" = " + sum); //parameters or receive
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num1 = input.nextInt();
        System.out.print("enter a number: ");
        int num2 = input.nextInt();
        call(num1,num2); // argument or send
    }
}
