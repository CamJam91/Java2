import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors ;
import java.util.stream.Stream;


public class MoviesTester
{
   public static void main(String[] args) throws IOException
   {
      List<Movie> moviesList = Movies.readMovies("movies.txt");
 
      // You'll write this method
      List<String> initialWords = commonInitialWords(moviesList.stream());
      
      System.out.println("Size: " + initialWords.size());
      System.out.println("Expected: 100");
      System.out.println("Word #1: " + initialWords.get(0));
      System.out.println("Expected: The");
      System.out.println("Word #2: " + initialWords.get(1));
      System.out.println("Expected: A");
      System.out.println("Word #3: " + initialWords.get(2));
      System.out.println("Expected: In");
      System.out.println("Word #4: " + initialWords.get(3));
      System.out.println("Expected: My");
      System.out.println("Word #5: " + initialWords.get(4));
      System.out.println("Expected: Love");
      System.out.println("Word #100: " + initialWords.get(99));
      System.out.println("Expected: She");
   }
   
   /**
    * Given a Stream<Movie> return the 100 most common
    * starting words.
    */
    //first word
    //most used in descending order
    //limit 100
    //sorted alphabetically
   public static List<String> commonInitialWords(Stream<Movie> stream) {
      List<String> commonsList = new ArrayList<>();
      Map<String, Integer> commonsMap = new HashMap<>();
      stream
         .map(movie -> movie.getTitle())
         .forEach(title -> {
            String firstWord = title.split("\\s+")[0]; //grab first word
               //put word in map if it doesn't exist increment it's value by 1 if it does
            commonsMap.put(firstWord, commonsMap.getOrDefault(firstWord, 0) + 1);
         });
      Stream<Map.Entry<String, Integer>> commonsStream = commonsMap.entrySet().stream(); //turn map into stream
         commonsList = commonsStream.sorted(Map.Entry.comparingByValue(new TitleComparator()))  //sort by value using the comparator
         .map(Map.Entry::getKey) //get a stream of key strings
         .limit(100)
         .collect(Collectors.toList());
      System.out.print(commonsList);
      return commonsList;
      
   }
   
  
   static class AlphaComparator implements Comparator<String> {
      @Override
      public int compare(String title1, String title2){
         int compare = title1.compareTo(title2);
         if (compare > 0) {return -1;}
         else if (compare < 0) {return 1;}
         else {return 0;}
      }
   }

   static class TitleComparator implements Comparator<Integer> {
      @Override
      public int compare(Integer title1, Integer title2){
         int compare = title1.compareTo(title2);
         if (compare > 0) {return -1;}
         else if (compare < 0) {return 1;}
         else {return 0;}
      }
   }

   

      
      
      

      
      
      
      
}