//Cameron Murphy CIS 2217 R01
//Class to handle file import and export
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {
    private BufferedReader in;

    //constructors

    /**
     * creates fileHandler, and reader throws exception if files does not exist
     * @param fileName
     */
        //reader
    public FileHandler(String fileName){
        try {
            this.in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //default constructor used for writing
    public FileHandler(){
    }




    public void closeReader(){
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //reader
    /**
     * Craetes a string builder and imports data delimited by a newline until reader is empty
     * @return StringBuilder
     */
    public StringBuilder fileImport(){
         StringBuilder returnString = new StringBuilder();
         try{
        String data;
        while ((data = in.readLine()) != null){
            returnString.append(data).append(" ");
        }
    }catch(IOException e){
        System.out.printf("\nThere was an IO exception");
    }
    return returnString;
}

    /**
     * creates a BufferedWriter and writes String value of Integer to each line
     * @param fileName
     * @param data
     */
    public void fileExport(String fileName, ArrayList<Integer> data){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
           for (Integer integer : data){
            writer.write(String.valueOf(integer));
            writer.newLine();
           } 
        }catch(IOException e){
            System.out.printf("File could not Be created");
        }
    }

}