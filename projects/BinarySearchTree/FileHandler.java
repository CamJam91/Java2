//Cameron Murphy CIS 2217 R01
//Class to handle file import and export
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    private BufferedReader in;
    private BufferedWriter out;

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

    //destructors
    public void closeWriter(){
        if (out != null) {
            try {
                out.close();
            } catch (IOException fileNotFound) {
                throw new RuntimeException(fileNotFound.getMessage());
            }
        }
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

}