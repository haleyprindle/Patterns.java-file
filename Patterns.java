//
//  Class author:  Haley Prindle
//  Date created: 10/30/25
//  General description: a brief summary of what this particular class does.
public class Patterns{

//
//  Pre-condition: The number of rows inputed has to be a number for the method to work. 
// the numbrs has to be greater than 0 for there to be any stars printed.
//  Post-condition: the result is a stack of stars that print out int rows number of rows. Each row has two more stars than the last. 
// the first row starts with one star.
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









//
//  Pre-condition: The input for the variable rows has to be greater than 0 for anything to be printed out.
//Also the input has to be a number for the method to work.
//  Post-condition: The result is a stack of numbers with the number of rows that was inputed. 
//Each row should print out the number of that row, rows times. 
//ex. inputing 5 for rows should output row one to be: 1, row two to be: 22, row three to be: 333, etc, printing a total of five rows 
//
public static void triangle(int rows){
   int currentRow = 1;
    int number = 1;

   while (currentRow <= rows) {
            int triangleCount = 1;

            while (triangleCount <= number) {
                
                System.out.print(number);
                triangleCount++;
            }
            number++;
            System.out.println(); 
            currentRow++;
        } 
}


// 
//  Pre-condition: The input has to be an odd number for the method to work.
//The method won't print out anything if the number is even and it won't work if a string is inputed.
//  Post-condition: The result of running this method would be a stack of numbers,
// starting with the start number. It'll repeat the number that number of times. 
//It will repeat this for each row. It skips over the even numbers; only outputs odd numbers
// It'll end the stack with the number 1
//
public static void odds(int start){
    int number =start;
    for(int i =start; i>0;i=i-2){
        if(start%2!=0){
        
            for(int j =number;j>0;){
                System.out.print(number);
                   j--;
        }
        number = number -2;
        System.out.println(); 
        }

}

    }    




//
//  Pre-condition: the input has to be a number greater than 0 for there to be an output.
//  Post-condition: Executing the method will create an alternating rows of Es and Os. 
// The number of letters in each row increases until the number reaches maxE, then it decreases
// until the row has one letter.
// If the number is even, it'll start with the letter O, and if the number is odd it'll start with E.
//
public static void eo(int maxE){
String letter = "E";
if(maxE%2==0){
    letter = "O";
}
//before the max is reached it increases
for(int i =1; i<= maxE; i ++){
    for(int j = 0; j<i; j ++){
        System.out.print(letter);
    }
    System.out.println();
   if(letter == "O"){
    letter ="E";
   }
   else{
    letter = "O";
   }
}

// when the max is reached, it decreases
for(int i = maxE-1; i>= 1; i--){
    for(int j =0; j<i; j++){
        System.out.print(letter);
    }
    System.out.println();
    if(letter == "O"){
        letter = "E";
    }
    else
    {
        letter = "O";
    }
}

}


public static void main(String[] args){

    stars(5);
    triangle(5);
    odds(7);
    eo(5);
    return;
}

//
//  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
//
public static void pyramid(int rows){

}

}


