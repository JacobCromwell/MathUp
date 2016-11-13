package mathUp;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Division extends Questions{
	
	
	public Division(int correct, int totalQuestions){
		this.correct = correct;
		this.totalQuestions = totalQuestions;
	}

	//division section
	public void askQuestions(){
		int answer = 0;
		for(int i=0; i<5; i++){
			Random generator = new Random();
			int x = generator.nextInt(12);
			int y = generator.nextInt(12);
			if(y == 0){
				y++;
			}
			
			int z = x/y;
			
			System.out.println("Solve for: " + x + " / " + y + " = ");
			Scanner user_input = new Scanner( System.in );
			try{
			answer = user_input.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("The application cannot yet handle decimal values. Our Top/only guy is working on this!");
			}
			if(answer == z){
				correct+=1;
				System.out.println("Correct!");
			}
			else{
				System.out.println("Wrong!");
				System.out.println("correct answer = " + z);
			}
			totalQuestions++;
		}
	}
}
