package com.tom.ggg;

public class ScoreFormatException extends Exception{

	@Override
	public String getMessage() {
		return"Score format incalid,cannot conver to int";
	}
	

}
