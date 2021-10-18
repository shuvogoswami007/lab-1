package task.pkg4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
      
     

    char operator;
    Double number1, number2, result;

   
    Scanner input = new Scanner(System.in);		
		 System.out.println("Enter first number");
                 int a = input.nextInt();		
		 System.out.println("Enter second number");
                 int b = input.nextInt();
		
		System.out.println("1. Addition (+).");
		
		System.out.println("2. Subtraction (-).");
		
		System.out.println("3. Multiplication (*).");
		
		System.out.println("4. Division (/).");
		
		System.out.println("Enter operation number: ");
		
		int x = input.nextInt();
		
		
				
		switch(x) {
		
		case 1:
			System.out.printf("The result is %d\n",(a+b));
			break;
		case 2:
			System.out.printf("The result is %d\n",(a-b));
			break;
		case 3:
			System.out.printf("The result is %d\n",(a*b));
			break;
		case 4:
			System.out.printf("The result is %d\n",(a/b));
		}
    
}



  }

    
