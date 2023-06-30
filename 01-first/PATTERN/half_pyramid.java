public class half_pyramid {
    public static void pyramid(int num1){
        for(int i=1; i<=num1; i++){

            for(int j=1; j<=num1-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        pyramid(4);
    }
}
