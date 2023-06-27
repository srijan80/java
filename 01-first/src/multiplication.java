import java.util.Scanner;
public class multiplication {
    public static void main(String []ags){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int i =1;
        while(i<=10){
            System.out.println(num+"*"+i+"="+num*i); //num*i
            i++;
        }


    }
}
