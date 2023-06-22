import java.util.Scanner;
public class sum_of_NUM {
    public static void main(String[] args) {
        System.out.print("enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum=0;
        int i=1;
        while(i <= num){
            sum=sum+i;
            i++;
        }
        System.out.println("sum is "+ sum);
    }
}
