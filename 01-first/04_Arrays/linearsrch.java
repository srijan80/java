public class linearsrch {
    public static int linearsearch(int number[], int key){
        for(int i=1; i<=number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int [] number= {2,5,3,9,74,10,57,43};
        int key = 10;
        int index = linearsearch(number,key);
        if(index== -1){
            System.out.print("Not found");
        }
        else{
            System.out.print("key is at: "+index);
        }

    }
}
