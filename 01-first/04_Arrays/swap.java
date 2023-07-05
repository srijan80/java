import java.util.Arrays;
public class swap {

    public static void Swap(int[] num ,int index1, int index2){
        int temp =0;
        temp = num[index1];
        num [index1]=num [index2];
        num [index2]= temp;
    }

    public static void main(String[]args){
        int []num={1,3,4,5,7,4,3};
        Swap(num, 1,3);
        System.out.println(Arrays.toString(num));
    }
}
