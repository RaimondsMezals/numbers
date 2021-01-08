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
	
	
	
		//Create a second method that when given the number 1-99 returns a String representation of this number, 
		// for example 1 = one, 11 = eleven, 21 = twenty-one.
		String textValue = "";
		
		String[] oneTeens = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		
		String[] tens = {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety", ""};
		
		String hundred = "hundred";
		
		String thousand = "thousand";
		
		
		public static String changeToString(int value) {
			
			String stringValue = "";
			
			stringValue = stringValue + value;
			
			return stringValue;
			
		}
		
		public static int stringLength(int value) {
			
			int length = 0;
			
			String output = changeToString(value);
			
			length = output.length();
			
			return length;
			
		}
		
		public static int getCharacter(int value, int nChar) {
			
			int converted = 0;
			
			String stringValue = changeToString(value);
			
			char charOutValue = stringValue.charAt(nChar);
			
			converted = Character.getNumericValue(charOutValue);
			
			return converted;
			
		}
		
		public String numTransition(int value) {
			
			String numberTran = "";
			int nOnes = 0;
			int nTens = 0;
			int nHundreds = 0;
			int nThousands = 0;
			
			if(value <= 19) {
				
				numberTran = oneTeens[value];
				
			}else if (stringLength(value) == 2){
				
				nOnes = getCharacter(value, 1);
				numberTran = oneTeens[nOnes];
				
				nTens = getCharacter(value, 0);
				numberTran = tens[nTens] + " " + numberTran;
				
			} else if (stringLength(value) == 3) {
				
				nOnes = getCharacter(value, 2);
				numberTran = oneTeens[nOnes];
				
				nTens = getCharacter(value, 1);
				numberTran = tens[nTens] + " " + numberTran;
				
				nHundreds = getCharacter(value, 0);
				numberTran = oneTeens[nHundreds] + " " + hundred + " " + numberTran;
				
			} else if (stringLength(value) == 4) {
				
				nOnes = getCharacter(value, 3);
				numberTran = oneTeens[nOnes];
				
				nTens = getCharacter(value, 2);
				numberTran = tens[nTens] + " " + numberTran;
				
				nHundreds = getCharacter(value, 1);
				numberTran = oneTeens[nHundreds] + " " + hundred + " " + numberTran;
				
				nThousands = getCharacter(value, 0);
				numberTran = oneTeens[nThousands] + " " + thousand + " " + numberTran;
				
			}
			
			
			
			return numberTran;
			
		}
		
		public void countToHundreds() {
			
			for (int i = 1; i <= 100; i++) {
				
				System.out.println(numTransition(i));
			}
			
		}
		
		public void countToThousands() {
			
			for (int i = 1; i <= 9999 ; i++) {

				System.out.println(numTransition(i));
			}
			
		}
	
	
	
	
}
