import java.util.Scanner;
public class star {
    public static void main(String []ags){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int i =1;
        while(i<=num){
            for(int j=1; j<=i; j++  ){                  //for(int j=1; j<=num-i+1; j++  ){// inverted star from 4(num) to 1
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
