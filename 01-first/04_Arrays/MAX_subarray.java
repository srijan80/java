public class MAX_subarray {

    public static void sub(int []num){
        int currSum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            int start =i;
            for(int j=i; j<num.length; j++){
                int end= j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    currSum+=num[k];
                }
                if(maxsum<currSum){
                    maxsum=currSum;

                }
            }
        }
        System.out.println("max : "+maxsum);
    }

    public static void kadanes(int number[]){
        int ms= Integer.MIN_VALUE;
        int cs =0;
        for(int i=0; i<number.length; i++){
         cs =cs+number[i];
         if(cs<0){
             cs=0;
         }
         ms =Math.max(cs,ms);
        }
        System.out.print("our max subarray: "+ms);
    }

    public static void main(String[]args){
        int [] num ={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);

    }
}
