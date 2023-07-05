import java.util.*;
public class prime_in_range {
    public static boolean check(int num){
        if(num==2){
            return true;
        }
        boolean isprime=true;  //not prime
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                isprime=false; //prime
            }
        }
        return isprime;
    }
    public static void range(int num){
        for(int i=2; i<=num; i++){
            if(check(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        range(num);

    }
}
