import java.util.*;
public class combinational {

    public static int factorial(int n){
        int s =1;
        for(int i=1; i<=n; i++){
            s = s *i;
        }
        return s;
    }
    public static int bincoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr= factorial(n-r);
        int bincoeff  = fact_n/ ( fact_r* fact_nmr);
        return bincoeff;
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a n: ");
        int n = input.nextInt();
        System.out.print("enter a r: ");
        int r = input.nextInt();
        System.out.println(bincoeff(n,r));
    }
}
