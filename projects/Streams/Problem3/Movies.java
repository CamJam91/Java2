//HIDE
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Movies
{
   public static List<Movie> readMovies(String filename) throws IOException
   {
      List<Movie> movies = new ArrayList<>();
      try (Scanner in = new Scanner(new FileInputStream(filename), "UTF-8")) 
      {
         // Throw away the //HIDE at the beginning of movies.txt
         in.nextLine(); // discard
         while (in.hasNextLine()) 
         {
            String nameLine = in.nextLine();
            String yearLine = in.nextLine();
            String directorsLine = in.nextLine();
            String producersLine = in.nextLine();
            String actorsLine = in.nextLine();
            movies.add(new Movie(getString(nameLine), 
                  Integer.parseInt(getString(yearLine)),
                  getList(directorsLine), getList(producersLine),
                  getList(actorsLine)));
         }
      }
      return movies;
   }

   private static String getString(String line)
   {
      int colon = line.indexOf(":");
      return line.substring(colon + 1).trim();
   }

   private static List<String> getList(String line)
   {
      return Stream.of(getString(line).split(", "))
         .collect(Collectors.toList());
   }
}
