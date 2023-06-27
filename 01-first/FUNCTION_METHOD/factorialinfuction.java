import java.util.*;
public class factorialinfuction {
    public static int fact(int num){
        int i=1;
        int sum =1;
        while(i<=num){
            sum=sum*i;
            i++;
        }
        return sum;
    }
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = input.nextInt();
       int prod = fact(num);
        System.out.println(prod);

    }
}
