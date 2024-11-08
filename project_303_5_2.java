

import java.util.Scanner;

public class project_303_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuesstheNumber.main(args);
		SubtractionQuizLoop.main(args);
		SentinelValuedemo.main(args);
	}

}

class GuesstheNumber {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 101);
	       Scanner input = new Scanner(System.in);
	       System.out.println("Guess a magic number between 0 and 100");
	       int guess = -1;
	       while (guess != number) {
	           
	           System.out.print("\nEnter your guess: ");
	           guess = input.nextInt();
	           if (guess == number)
	               System.out.println("Yes, the number is " + number);
	           else if (guess > number)
	               System.out.println("Your guess is too high");
	           else
	               System.out.println("Your guess is too low");
	       } 
	   }
	}

class SubtractionQuizLoop {
public static void main(String[] args) {
   final int NUMBER_OF_QUESTIONS = 5; 
   int correctCount = 0; 
   int count = 0; 
   long startTime = System.currentTimeMillis();
   String output = ""; 
   Scanner input = new Scanner(System.in);

   while (count < NUMBER_OF_QUESTIONS) {

       int number1 = (int) (Math.random() * 10);
       int number2 = (int) (Math.random() * 10);
       
       if (number1 < number2) {
           int temp = number1;
           number1 = number2;
           number2 = temp;
       }
       
       System.out.print(
               "What is " + number1 + " - " + number2 + "? ");
       int answer = input.nextInt();
      
       if (number1 - number2 == answer) {
           System.out.println("You are correct!");
           correctCount++;
       } else
           System.out.println("Your answer is wrong.\n" + number1
                   + " - " + number2 + " should be " + (number1 - number2));
       
       count++;
       output += "\n" + number1 + "-" + number2 + "=" + answer +
               ((number1 - number2 == answer) ? " correct" : " wrong");
   }
}
}

class SentinelValuedemo{
	   public static void main(String[] args) {
	      
	       Scanner input = new Scanner(System.in);

	       System.out.print("Enter an int value (the program exits if the input is 0): ");
	       int data = input.nextInt();
	       
	       int sum = 0;
	       while (data != 0) {
	         sum += data;
	         
	         System.out.print( "Enter an int value (the program exits if the input is 0): ");
	         data = input.nextInt();
	       }
	       System.out.println("The sum is " + sum);
	   }