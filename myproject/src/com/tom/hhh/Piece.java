package com.tom.hhh;

import java.util.ArrayList;
import java.util.List;

public class Piece {
	
	String s ;
	int n;
	public Piece(int n)throws ZeroException,NumberExcpetion,RightException,RangeException{
		
		
		if(n==0) {
			throw new ZeroException();
		}else if(n>0&&n<16&&n!=8&&n!=12&&n!=16) {
			throw new NumberExcpetion();
		}else if (n==8||n==12||n==16){
			throw new RightException();
		}else if(n<0||n>16) {
			throw new RangeException();
		}
	}

}
