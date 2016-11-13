package mathUp;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MathUp {

	public void makeSelection(){
		
		int correct = 0;
		int totalQuestions = 0;
		boolean running = true;
		
		while(running != false){
		System.out.println("Welcome to the training you created to keep your brain up");
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		System.out.println("5: Exponents");
		System.out.println("6: View Results");
		System.out.println("7: Quit");
		Scanner userString = new Scanner( System.in );
		int mathType = userString.nextInt();
		
		//switch(mathType){
		if(mathType == 1){
			Addition questions = new Addition(correct, totalQuestions);
			questions.askQuestions();
			correct = questions.getCorrect();
			totalQuestions = questions.getTotalQuestions();
		}
		if(mathType == 2){
			Subtraction questions = new Subtraction(correct, totalQuestions);
			questions.askQuestions();
			correct = questions.getCorrect();
			totalQuestions = questions.getTotalQuestions();
		}
		if(mathType == 3){
			Multiplication questions = new Multiplication(correct, totalQuestions);
			questions.askQuestions();
			correct = questions.getCorrect();
			totalQuestions = questions.getTotalQuestions();
		}
		if(mathType == 4){
			Division questions = new Division(correct, totalQuestions);
			questions.askQuestions();
			correct = questions.getCorrect();
			totalQuestions = questions.getTotalQuestions();
		}
		if(mathType == 5){
			Exponents questions = new Exponents(correct, totalQuestions);
			questions.askQuestions();
			correct = questions.getCorrect();
			totalQuestions = questions.getTotalQuestions();
		}
		if(mathType == 6){
			viewResults(correct, totalQuestions);
		}
		if(mathType == 7){
			quit();
		}
		//}
		
		}
	}
		
				
	
	public static void viewResults(int correct, int totalQuestions){
		System.out.println("Congratulations! So far you've gotten " + correct + " right answers!");
		System.out.println("Out of a total of " + totalQuestions);
	}
	
	public static void quit(){
		System.out.println("Thank you oh so much for using mathUp!");
		System.exit(0);
	}
	
	public static void main(String[] args) {
			MathUp beginProgram = new MathUp();
			beginProgram.makeSelection();

	}

}
