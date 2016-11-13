package mathUp;

public abstract class Questions {
	
	public int correct = 0;
	public int totalQuestions = 0;
	
	public abstract void askQuestions();
	
	public int getCorrect(){
		return correct;
	}
	
	public int getTotalQuestions(){
		return totalQuestions;
	}

}
