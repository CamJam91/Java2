package murphy;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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
                case 2: if (verifyArray()) {displayData(meteorites);}
                        break;
                case 3: if (verifyArray()) {saveData();}
                        break;
                case 4: if (verifyArray()) {nameSearch(scanner);}
                        break;
                case 5: if (verifyArray()) {IDSearch(scanner);}
                        break;
                case 6: if (verifyArray()) {massSearch(scanner);}
                        break;
                case 7: if (verifyArray()) {recentSearch(scanner);}
                        break;
                case 8: if (verifyArray()) {classSort();}
                        break;
                default: break;
            }
        } while(userChoice != 0);
    }

        /*
         * 
         * Display methods
         * 
         */
    /**
     * uses forEach method on a stream to print toString()'s
     */
    public static void displayData(Meteorite [] meteorites){
       Stream meteoriteStream = Stream.of(meteorites);
       meteoriteStream
       .forEach(meteorite -> System.out.printf("%s\n",meteorite.toString()));
    }
    /**
     * display helper displays a single meteorites dat or an error if it is null
     * @param meteorite
     */
    public static void displayData(Meteorite meteorite){
        if (meteorite == null) {System.out.printf("\nThe meteorite was not found.");}
        else {System.out.printf("\nMeteorite data: \n %s\n\n", meteorite);}
    }
    public static void displayData(Map<String, Integer> recclasses){
        Set<String> keySet = recclasses.keySet();
            //for each key print it and the corresponding value in the map
        keySet.stream()
            .forEach(recclass -> System.out.printf("%-30s\t\t%d\n", recclass, recclasses.get(recclass)));
    }

    /*
     * 
     * User Methods
     * 
     */
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

    /**
     * convert json data to binary then write to default file
     */
    public static void saveData(){
        Gson gson = new Gson();
        try (OutputStream outMeteorite = new FileOutputStream("NASA_Meteorite.json")){
            String meteoritedata = gson.toJson(meteorites);
            byte[] byteData = meteoritedata.getBytes("UTF-8");
            outMeteorite.write(byteData);
        }catch (IOException e){
            System.out.printf("File write failure\n");
        }
        
    }

    /**
     * uses stream to find object name then calls display data with filled or null object
     * @param scanner
     */
    public static void nameSearch(Scanner scanner){
        scanner.nextLine(); //clear buffer
        System.out.printf("Enter the name of the meteorite you are searching for: \n>>");
        String meteoriteName = scanner.nextLine();
            //look for name string (there will only be one so parallel and findany are used)
        Meteorite target = Stream.of(meteorites)
            .parallel()
            .filter(meteorite -> meteorite.getName().equalsIgnoreCase(meteoriteName))
            .findAny()
            .orElse(null);
            
        displayData(target);
    }

    /**
     * uses stream to find object name then calls display data with filled or null object
     * @param scanner
     */
    public static void  IDSearch(Scanner scanner){
        scanner.nextLine(); //clear buffer
        System.out.printf("Enter the name of the meteorite you are searching for: \n>>");
        String meteoriteID = scanner.nextLine();

            //look for ID string (there will only be one so parallel and findany are used)
        Meteorite target = Stream.of(meteorites)
            .parallel()
            .filter(meteorite -> meteorite.getID().equals(meteoriteID))
            .findAny()
            .orElse(null);

        displayData(target);
    }
    
    /**
     * asks user for a limit then uses stream to give the largest massed objects (with user limit)
     * @param scanner
     */
    public static void massSearch(Scanner scanner){
        scanner.nextLine(); //clear buffer
        System.out.printf("How many of the largest meteorites would you like to see?\n>>");
        int userLimit = scanner.nextInt();
        Meteorite [] largestMass = Stream.of(meteorites)
            .sorted(Comparator.comparing(Meteorite::getMassDouble).reversed())
            .limit(userLimit)
            .toArray(Meteorite[] :: new);
        
        displayData(largestMass);
    }
    /**
     * compares years then creates user limited array based on highest to lowest value
     * @param scanner
     */
    public static void recentSearch(Scanner scanner){
        scanner.nextLine(); //clear buffer
        System.out.printf("How many of the most recent meteorites would you like to see?\n>>");
        int userLimit = scanner.nextInt();
        Meteorite [] mostRecent = Stream.of(meteorites) 
            .sorted(Comparator.comparing(Meteorite::getYearInteger).reversed())
            .limit(userLimit)
            .toArray(Meteorite[] :: new);

        displayData(mostRecent);
    }
    /**
     * creates a map of recclass string keys and occurrance values 
     */
    public static void classSort(){
        Map<String, Integer> reclasses = new HashMap<>();
            //creates string stream of unique meteorite name strings, adds them to map as keys
        Stream.of(meteorites)
            .map(meteorite -> meteorite.getRecclass())
            .distinct()
            .forEach(recclass -> reclasses.put(recclass, 0)); //grab recclass strings, add unique ones to our map
            //creates a string stream of nonunique recclasses and updates map values each time for each one
        Stream.of(meteorites)
            .map(meteorite -> meteorite.getRecclass())
            .forEach(recclass ->reclasses.put(recclass, (reclasses.get(recclass))+1));
        
        displayData(reclasses);
        
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