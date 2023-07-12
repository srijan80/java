public class Stock {
    public static int stock(int []num){
        int buy= Integer.MAX_VALUE;
        int maxprofit= 0;
        for(int i=0; i<num.length; i++){
            if(buy<num[i]){
                int profit = num[i]-buy;
                maxprofit=Math.max(maxprofit, profit);
            }
            else{
                buy= num[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[]args){
        int []value={7,1,5,3,6,4};
        System.out.print(stock(value));
    }
}
