public class EvenNumberAnalyzer {
    public static void main(String [] args){
        
        //Declaring the variables
        int limit = 20;
        int count = 0;
        int sum = 0;
        
        //create a loop to iterate from 1 to limit
        for(int i=1; i <= limit; i++){
            //used condition to ger even numbers
            if (i%2==0){
                System.out.println(i);
                count++;
                sum = sum + i;
            }
        }
        
        //Printing the output
        System.out.println("The total count of even numbers: "+count);
        System.out.println("The total sum of all even numbers: "+sum);
    }
}
