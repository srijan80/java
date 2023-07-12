public class Smalllest_num {

    public static int snum(int [] num){
        int n=num[0];
        for(int i=1; i<num.length; i++){
            if(n>num[i]){
                n=num[i];
            }
        }
        return n;
    }
    public static void main(String[]args){
        int [] num = {7,3,2,9,6};
        System.out.print(snum(num));

    }
}
