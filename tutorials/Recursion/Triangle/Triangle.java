public class Triangle{
    private int width; //width of the triangle

        //constructor with width param
    public Triangle(int width){
        this.width = width;
    }

    public int getArea(){ //recursive function
        if (width <= 0){return 0;} //validation
        else if (width == 1) {return 1;} //base case stops recursion by returning 
        else{ //we have not reached base case
            Triangle smallerTriangle; //create new triangle object
            int smallerArea; 
                //call triangle constructor but make it 1 int smaller than previous
                //this is the smaller caller
            smallerTriangle = new Triangle(width-1);
            smallerArea = smallerTriangle.getArea(); //call recursive function
            return smallerArea + width; //return after recursion has stopped
        }
    }
}