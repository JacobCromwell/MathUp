package mathUp;

import java.util.Random;
import java.util.Scanner;

public class Addition extends Questions{

	
	public Addition(int correct, int totalQuestions){
		this.correct = correct;
		this.totalQuestions = totalQuestions;
	}
	
	public void askQuestions(){
		//addition section
		for(int i=0; i<5; i++){
			Random generator = new Random();
			int x = generator.nextInt(12);
			int y = generator.nextInt(12);
			int z = x+y;
			System.out.println("Solve for: " + x + " + " + y + " = ");
			Scanner user_input = new Scanner( System.in );
			int answer = user_input.nextInt();
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
		//return correct;	
	}	
	
	public int getCorrect(){
		return correct;
	}
	
	public int getTotalQuestions(){
		return totalQuestions;
	}
}
