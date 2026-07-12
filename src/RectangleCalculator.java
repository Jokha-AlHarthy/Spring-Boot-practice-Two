public class RectangleCalculator {
    public static void main(String [] args){
        //Declaring variables
        double length = 12.5;
        double width = 8.0;

        //Calculate the area and the length
        double area = length * width;
        double perimeter = 2 * (length + width);

        //Printing the output of each variable
        System.out.println("The length of the rectangle is: "+length);
        System.out.println("The width of the rectangle is: "+width);
        System.out.println("The area of the rectangle is: " +area);
        System.out.println("The perimeter of the rectangle is: " +perimeter);
    }
}
