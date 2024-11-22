package murphy;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

import com.google.gson.Gson;

public class UserInterface {
   private static Scanner scanner;
   private static Meteorite [] meteorites;
   private static int userChoice;

   public static void go(){
        scanner = new Scanner(System.in);
        do{
            System.out.printf("Choose a menu Option\n");
            System.out.printf("0) Quit \n1) Import meteorite data from a JSON file" +
            "\n2) Display Meteorite Data \n3) Export Data to a File \n4) Find Meteorite by name" +
            "\n5) Find Meteorite by ID \n6) List the Largest Meteorites"  +
            "\n7) List Most Recent Meteorite by Year \n8) List the Meteorite by Class\n>>");
            userChoice = scanner.nextInt(); 

            switch (userChoice){
                case 1: importData(scanner);
                        break;
                case 2: if (verifyArray()) {displayData();}
                        break;
                case 4: if (verifyArray()) {meteoriteSearch();}
                default: break;
            }
        } while(userChoice != 0);
    }

    /**
     * uses gson to import default json file or user specified file
     * @param userChoice
     */
    public static void importData(Scanner scanner){
        scanner.nextLine();
        System.out.printf("Enter the JSON File Name or press <Enter> for the Default (NASA_Meteorite.json):");
        String filePath = scanner.nextLine();
        if (filePath.isEmpty()) {filePath = "NASA_Meteorite.json";}
        
        try(FileReader meteorReader = new FileReader(filePath)){
            Gson gson = new Gson();
            meteorites = gson.fromJson(meteorReader, Meteorite[].class);
            System.out.printf("%s read successfully\n\n", filePath);
        }catch(IOException e){
            System.out.printf("The file: %s was not found.", filePath);
        }
    }

    public static void displayData(){
       Stream meteoriteStream = Stream.of(meteorites);
       meteoriteStream
       .forEach(meteorite -> System.out.printf("%s\n",meteorite.toString()));
    }

    /**
     * helper used for quick check of null array and user prompt if it is null
     * @return
     */
    public static boolean verifyArray(){
        if (meteorites != null) {return true;}
        else {
            System.out.printf("The meteories list is empty.");
            return false;
        }
    }
}