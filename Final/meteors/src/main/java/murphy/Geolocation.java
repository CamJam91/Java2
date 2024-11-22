package murphy;

public class Geolocation {
   private String type;
   private double [] coordinates;

   //constructors
   public Geolocation(String type, double [] coordinates){
    this.type = type;
    this.coordinates = coordinates;
   }

   public Geolocation(String type, double xCoordinate, double yCoordinate){
    this.type = type;
    this.coordinates = new double[]{xCoordinate, yCoordinate};
   }

   //getters
   public String getType(){
    return type;
   }

   public double [] getCoordinates(){
    return coordinates;
   }

   @Override
   public String toString(){
    return String.format("Type = %s, Coordinates[.6%f, .6%f]", type, coordinates[0], coordinates[1]);
   }

}
