import java.util.Random;
import java.util.stream.Stream;

public class StreamUtil
{
   /**
    * Measures the time it takes to count the number of odd numbers using
    * an infinite stream, given a limit. 
    * @param generator the Random generator used to generate the numbers.
    * @param limit the number of odd numbers to count
    * @param isParallel if true, use a parallel stream
    */
   public static long timeOdds(Random generator, int limit, boolean isParallel)
   {
      Integer SEED = (Integer.MIN_VALUE - Integer.MAX_VALUE) + 1; //create seed lower and upper vales based on Integer
      generator.setSeed(SEED);
      if (isParallel){
         Long start = System.nanoTime(); //start timer
            //create odd stream limited by limit parameter
         Long count = Stream.generate(() -> Integer.MIN_VALUE + (int) (Integer.MAX_VALUE))
            .parallel()
            .filter(number -> !(number % 2 == 0))
            .limit(limit)
            .count();

         long end = System.nanoTime(); //end timer
         return end-start; //return time spent on stream
      } else{
         Long start = System.nanoTime();
         Long count = Stream.generate(() -> Integer.MIN_VALUE + (int) (Integer.MAX_VALUE))
            .filter(number -> !(number % 2 == 0))
            .limit(limit)
            .count();

         long end = System.nanoTime();
         return end-start; 
      }
      
   }
}