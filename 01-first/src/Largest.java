import java.util.Scanner;
public class Largest {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        if(a>b){
//            System.out.print("a is greater");
//        }
//        else if(b>c){
//            System.out.print("b is greater");
//
//        }
//        else{
//            System.out.print("c is greater");
//        }
        int max = a;
        if(b>max){
            max=b;
        }
        else if(c>max){
            max=c;
        }
        System.out.print(max);




    }
}
