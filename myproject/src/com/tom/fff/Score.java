package com.tom.fff;

public class Score {
	int score;
	public void testException(int score) throws MyException{	
		if(score<0||score>100) {
			throw new MyException();
		}else {
			this.score=score;	
			
			}
			
		}
	
	

}
