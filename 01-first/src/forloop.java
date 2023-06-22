import java.util.Scanner;
public class forloop {
    public static void main(String[] arg){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number:- ");
    int num = input.nextInt();
    for(int i=1; i<=num; i++){
        System.out.println(i);
    }

    }
}
