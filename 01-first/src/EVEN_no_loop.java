import java.util.Scanner;
public class EVEN_no_loop {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:- ");
        int num = input.nextInt();

//        1
//        int i=2;
//        while(i<=num){
//            System.out.println(i);
//            i=i+2;
//        }


//        2
        for(int i=2; i<=num; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }

}
