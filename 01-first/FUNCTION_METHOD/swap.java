import java.util.*;
public class swap {

    public static void swap(int a,int b){

        int temp=0;
        temp =a;
        a=b;
        b=temp;
        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }
    public static void main(String[]args){
        Scanner input =new Scanner (System.in);
        System.out.print("enter a number: "); //a
        int a = input.nextInt();
        System.out.print("enter a number: ");//b
        int b = input.nextInt();
        swap(a,b);

    }
}
