import java.util.Arrays;
public class SmallestElement{
    public static void main(String[] args){
        int [] myArray = {3,56,7,99,100,4,5};
        int smallest = findSmallest(myArray);
        System.out.print(smallest);
    }

    public static int findSmallest(int [] myArray){
        int smallest = myArray[myArray.length-1];
        if (myArray.length == 1){
            return smallest;
        }
        if(myArray[myArray.length-1]<smallest){
            smallest = myArray[myArray.length-1];
        }
        int [] smaller = Arrays.copyOf(myArray,myArray.length-1); 
        return findSmallest(smaller);
    }
}