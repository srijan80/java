public class largestnum {
    public static int largest(int []num){
        int number =num[0];
        for(int i=0; i<num.length; i++){
            if(number<num[i]){
                number=num[i];
            }
        }
        return number;
    }
    public static void main(String[] args) {
        int [] num ={22,55,33,77,99};
//        largest(num);
        System.out.println(largest(num));
    }
}
