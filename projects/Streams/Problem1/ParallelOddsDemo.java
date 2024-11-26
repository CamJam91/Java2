import java.util.Random;

public class ParallelOddsDemo
{
   public static void main(String[] args)
   {
      Random gen = new Random(42);
      for (int n = 10; n < 1000000000; n *= 10)
      {
         System.out.print("Limit of " + n);
         long parallel = StreamUtil.timeOdds(gen, n, true);
         long sequential = StreamUtil.timeOdds(gen, n, false);
         if (parallel < sequential)
         {
            System.out.println(", parallel stream faster for n->" + n);
         }
         else
         {
            System.out.println(", sequential stream faster for n->" + n);
         }
      }
   }
}
