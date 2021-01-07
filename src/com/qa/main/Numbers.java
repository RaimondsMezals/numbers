package com.qa.main;

public class Numbers {
	
	public int addingNumbersTogether(int a) {
		//Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
		int sumOfAdded = 0;
		
		if(a >= 10 && a < 100) {
			
	    String addedDigits = Integer.toString(a);
	    
	    char char1 = addedDigits.charAt(0);
	    char char2 = addedDigits.charAt(1);
	    
	    int b = Character.getNumericValue(char1);
	    int c = Character.getNumericValue(char2);
	    
	    sumOfAdded = b + c;
		}
		
		return sumOfAdded;
	    
	}
	
	public String stringRepresentingNumber() {
		//Create a second method that when given the number 1-99 returns a String representation of this number, 
		// for example 1 = one, 11 = eleven, 21 = twenty-one.
		String textValue = "";
		
		String one = "one";
		String two = "two";
		String three = "three";
		String four = "four";
		String five = "five";
		String six = "six";
		String seven = "seven";
		String eight = "eight";
		String nine = "nine";
		String ten = "ten";
		String eleven = "eleven";
		String twelve = "twelve";
		String thirteen = "thirteen";
		String fourteen = "fourteen";
		String fifteen = "fifteen";
		String sixteen = "sixteen";
		String seventeen = "seventeen";
		String eighteen = "eighteen";
		String nineteen = "nineteen";
		
		
		
		
		return textValue;
		
	}
	
	
	
	
}
