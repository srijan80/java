public class daimond_ {
    public static void daimond(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
//
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[]args){
        daimond(5);
    }
}