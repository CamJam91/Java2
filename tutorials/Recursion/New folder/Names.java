import java.util.Scanner;
import java.util.ArrayList;

public class Names{
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<String> permList = new ArrayList<String>();
      String name;
      
      while(!scnr.hasNextInt())
        nameList.add(scnr.next());
      System.out.print(nameList);
   }
}