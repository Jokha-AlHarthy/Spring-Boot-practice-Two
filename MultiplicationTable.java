public class MultiplicationTable {
    public static void main(String[] args){

        //Declaring the variables
        int base = 9;


        //create for loop to run the counter from 1 to 10
        for(int i=1; i<=10; i++){

            //calculate the product of base and the counter, and store it in a variable named result
            int result = base * i;
            System.out.println(base+" x "+ i+" = "+result);
        }
    }
}
