import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        System.out.print("enter your name:- ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("enter your age:- ");
        int age = input.nextInt();
//        System.out.printf("your name: %s \nYour age: %s ", name , age );
        System.out.println("Your name: "+name+"\nYour age: "+age );



    }
}