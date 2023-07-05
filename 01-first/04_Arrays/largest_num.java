public class largest_num {
    public static int number(int num[]){
//        int largest= Integer.MIN_VALUE; //(  -infinity  )
        int largest = num[0];
        for(int i=1; i<num.length; i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String[]args){
        int [] num= {1,3,6,2,19,98,33};
       System.out.println(number(num));
    }
}
