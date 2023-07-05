import java.util.*;
public class prime_or_not {

    public static boolean check(int num){
        if(num==2){
            return true;
        }

        boolean isprime=true;  //not prime
          for(int i=2; i<=Math.sqrt(num); i++){        //this is  optmised code
//        for(int i=2; i<=num-1; i++){                //this is unoptmised code
            if(num%i==0){
               isprime=false; //prime
            }
        }
        return isprime;
    }
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(check(num));

    }
}
