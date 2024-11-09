import java.util.Arrays;
public class Sums{
    public static void main(String args[]){
        int [] myArray = {1,2,-9};
        int sum = sums(myArray);
        System.out.println(sum);
    }

    public static int sums(int[] sumMe){
        if(sumMe.length == 1)
            return sumMe[sumMe.length-1];
        else{
            int [] newInt = Arrays.copyOf(sumMe, sumMe.length-1);
            return sumMe[sumMe.length-1] + sums(newInt);
        }
    }
}