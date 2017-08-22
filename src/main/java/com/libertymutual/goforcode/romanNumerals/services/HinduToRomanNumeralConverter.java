package com.libertymutual.goforcode.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int input) {
		// TODO Auto-generated method stub
		if (input < 1 || input > 1000)
			return "invalid numeral" ;
		String n = "";
		
	
		while (input >= 1000) {
			n += "M";
			input -= 1000;
		}
		
		while (input >= 900) {
			n += "CM";
			input -= 900;
		}
		
		while (input >= 500) {
			n += "D";
			input -= 500;
		}
		
		while (input >= 400) {
			n += "CD";
			input -= 400;
		}
		
		while (input >= 100) {
			n += "C";
			input -= 100;
		}
		
		while (input >= 90) {
			n += "XC";
			input -= 90;
		}
		
		while (input >= 50) {
			n += "L";
			input -= 50;
		}
		
		while (input >= 40) {
			n += "XL";
			input -= 40;
		}
		
		while (input >= 10) {
			n += "X";
			input -= 10;
		}
		
		while (input >= 9) {
			n += "IX";
			input -= 9;
		}
		
		while (input >= 5) {
			n += "V";
			input -= 5;
		}
		
		while (input >= 4) {
			n += "IV";
			input -= 4;
		}
		
		while (input >= 1) {
			n += "I";
			input -= 1;
		}
		
		return n; 
	} 

}
