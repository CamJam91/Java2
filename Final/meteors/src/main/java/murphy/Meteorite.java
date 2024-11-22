package murphy;


public class Meteorite {
    private String name;
    private String id;
    private String nameType;
    private String recclass;
    private String mass;
    private String fall;
    private String year;
    private String reclat;
    private String reclong;
    private Geolocation geolocation;

    //constructors
    public Meteorite(String name, String id, String nameType, String recclass, String mass, String fall,
    String year, String reclat, String reclong, Geolocation geolocation){
        this.name = name;
        this.id = id;
        this.nameType = nameType;
        this.recclass = recclass;
        this.mass = mass;
        this.fall = fall;
        this.year = year;
        this.reclat = reclat;
        this.reclong = reclong;
        this.geolocation = geolocation;

    }

    //getters
    public String getName(){
        return name;
    }
    public String getID(){
        return id;
    }
    public String getNameType(){
        return nameType;
    }
    public String getRecclass(){
        return recclass;
    }
    public String getMass(){
        return mass;
    }
    public Double getMassDouble(){
        if (mass == null) return -1.0;
        return Double.parseDouble(mass);
    }
    public String getFall(){
        return fall;
    }
    public String getYear(){
        if (year == null) {return "-1";}
        return year.substring(0, 4);
    }
    public Integer getYearInteger(){
        if (year == null) {return -1;}
        return Integer.parseInt(year.substring(0,4));
    }
    public String getReclat(){
        return reclat;
    }
    public String getReclong(){
        return reclong;
    }
    public Geolocation getGeolocation(){
        return geolocation;
    }
    
    //methods
    @Override
    public String toString(){
        String returnString =  String.format("Name = %s, ID = %s, NameType = %s, Recclass = %s, Mass = %s," +
         "Fall = %s, Year: %s, reclat = %s, reclong = .%s, ",
         name, id, nameType, recclass, mass, fall, getYear(), reclat, reclong);
         if (geolocation != null) {returnString += String.format("Geolocation: %s", geolocation.toString());}
         return returnString;
    }
}
