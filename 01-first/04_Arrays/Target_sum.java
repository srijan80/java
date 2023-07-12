public class Target_sum {
    public static int sum(int []num){
        int first= num[0];
        int target = 7; // we need to find those number that sum is 7
        int sum=0;
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num.length; j++){
                if(num[i]+num[j]==target){
                    sum=num[i]+num[j];

                }
            }
        }
        return sum;
    }
    public static void main(String []args){
        int []n={4,6,3,5,8,2};
        System.out.print(sum(n));
    }
}
