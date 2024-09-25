public class Person
{
    protected String name;

    public Person(String name){
        this.name = name;
    }
    
        //getters
    public String getName(){
        return name;
    }

        //setters
    public void setName(String name){
        if (name != null && !name.equals("")){
            this.name = name;
        }
    }
}