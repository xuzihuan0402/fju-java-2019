package com.tom.ggg;

public class Score {
	String s;
	int value;
	public Score(String s) throws ScoreFormatException,OutRangeException{  //做个宣告
	try {
		value = Integer.parseInt(s);
	}catch(NumberFormatException e) {
		throw new ScoreFormatException();
	}
	if(value<0||value>100) {
		throw new OutRangeException();
	}
	
	}
	
	
}
