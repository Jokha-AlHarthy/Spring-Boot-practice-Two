public class FactorialCalculator {
    public static void main (String[] args){

        //Declaring the variables
        int number = 7;
        long factorial = 1;
        int i = 1;

        //create a while loop to calculate the factoril
        while(i<=number){
            factorial = factorial * i;
            i++;
        }

        //printing the output
        System.out.println("The number is: "+ number);
        System.out.println("The factorial is: "+ factorial);
    }
}
