public class SEC_largest_num{

    public static int sec(int [] num){
        int second=-1;
        int largest = num[0];
        for(int i=1; i<num.length; i++){
            if(largest<num[i]){  //arr={2,5,3,7,99,50,9,4};
                second = largest;
                largest=num[i];
            }
            else if( num[i] >second ){
                second = num[i];
            }
        }
        return second;
    }
    public static void main(String[]args){
        int [] arr={2,5,3,7,99,50,9,4};
        System.out.println(sec(arr));
    }
}