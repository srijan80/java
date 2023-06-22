import java.util.Scanner;
public class Dowhileloop {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:- ");
        int num = input.nextInt();

        int i =1;
        do{
            System.out.print(i);
            i++;
        }while (i<=num);

    }

}
