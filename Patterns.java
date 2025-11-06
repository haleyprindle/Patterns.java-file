//
//  Class author:  Haley Prindle
//  Date created: 10/30/25
//  General description: a brief summary of what this particular class does.
public class Patterns{

//
//  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
//


public static void stars(int rows){
   int currentRow = 1;

        while (currentRow <= rows) {
            int numStars = (2 * currentRow) - 1; // Calculate number of stars for the current row
            int starCount = 1;

            while (starCount <= numStars) {
                System.out.print("*");
                starCount++;
            }
            System.out.println(); // Move to the next line after printing stars for the current row
            currentRow++;
        }
    }





public static void main(String[] args){

    stars(5);
    return;
}



//
//  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
//
public static void triangle(int rows){
    
}



//
//  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
//
public static void odds(int start){


}


//
//  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
//
public static void eo(int maxE){


}


//
//  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
//
public static void pyramid(int rows){

}
}


