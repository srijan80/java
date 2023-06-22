import java.util.Scanner;
public class String_loop {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String str =input.next();
        for(int i=0; i<=str.length()-1; i++ )
            System.out.print(str.charAt(i) + " ");

    }

}

