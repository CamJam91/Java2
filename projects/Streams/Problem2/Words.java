import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Complete the methods below. You may add helper methods
 * as you require.
 */
public class Words
{      
   /**
    * The noLetterRepeated method reads all of the words 
    * in filename and returns a list of all words with 
    * length of at least ten, in which no letter is repeated.
    * You may assume that filename has one word per line.
    */
   public static List<String> noLetterRepeated(String filename)
   {
      List<String> result;
      try (Stream<String> lines = Files.lines(Paths.get(filename))){
             result = lines
               .filter(line -> !line.endsWith("'s"))
               .filter(line -> line.length() >= 10)
               .filter(line -> allLettersUnique(line) == true)
               .collect(Collectors.toList());
      }catch(IOException e){
         System.out.printf("File not found");
         return null;
      }

      return result;
   }
   
   /**
    * The longestWord method takes a Stream<String> and
    * returns the longest word in the stream.
    */
   public static String longestWord(Stream<String> stream)
   {
      String result = stream
      .max ((w1, w2) -> w1.length() - w2.length())
      .orElse("");

      return result;
   }
   
   /**
    * Given a Stream<String> and a length, 
    * returns the number of words of that length in the stream.
    */
   public static long wordCount(Stream<String> stream, int len)
   {
      long result = stream
      .filter(word -> (word.length()==len))
      .count();
      return result;
   }

   /**
    * helper method takes a word, splits it and checks the split array for duplicates
    * @param word
    * @return
    */
   public static boolean allLettersUnique(String word){
      String [] splitWord = word.split("");
      for (int countX = 0; countX < word.length(); countX++){
        for (int countY = countX + 1; countY < word.length(); countY++){
         if (splitWord[countX].equals(splitWord[countY])) {return false;}
      }
   }
   return true;
}

}
