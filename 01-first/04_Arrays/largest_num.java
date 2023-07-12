public class largest_num {
    public static int largest(int []num){
        int number =num[0];
        for(int i=1; i<num.length; i++){
            if(number<num[i]){
                number=num[i];
            }
        }
        return number;
    }
    public static void main(String[] args) {
        int [] num ={79,55,33,77,99};
//        largest(num);
        System.out.println(largest(num));
    }
}
