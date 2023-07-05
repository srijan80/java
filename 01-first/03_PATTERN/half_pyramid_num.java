public class half_pyramid_num {
    public static void pyramid(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[]args){
        pyramid(5);
    }
}
