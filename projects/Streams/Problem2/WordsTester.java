import java.io.IOException;
import java.util.List;

public class WordsTester
{      
   public static void main(String[] args) throws IOException
   {
      List<String> words = Words.noLetterRepeated("words.txt");
      System.out.println("Number of words: " + words.size());
      System.out.println("Expected: 576");

      String longestWord = Words.longestWord(words.stream());
      System.out.println("Longest word: " + longestWord);
      System.out.println("Expected: ambidextrously");

      System.out.println("Length of longest word: " + longestWord.length());
      System.out.println("Expected: 14");

      System.out.println("Length 10 count: " + Words.wordCount(words.stream(), 10));
      System.out.println("Expected: 424");

      System.out.println("Length 11 count: " + Words.wordCount(words.stream(), 11));
      System.out.println("Expected: 129");

      System.out.println("Length 12 count: " + Words.wordCount(words.stream(), 12));
      System.out.println("Expected: 21");

      System.out.println("Length 13 count: " + Words.wordCount(words.stream(), 13));
      System.out.println("Expected: 1");
      
      System.out.println("Length 14 count: " + Words.wordCount(words.stream(), 14));
      System.out.println("Expected: 1");                         
   }
}
