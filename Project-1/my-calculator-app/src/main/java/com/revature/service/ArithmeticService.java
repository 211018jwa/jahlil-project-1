package com.revature.service;


public class ArithmeticService {

	public String doAddition(String number1String, String number2String) {
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);
		
		double sum = number1 + number2;
		
		String result = "The Sum Total is " + sum;
		
		return result;
	}

	public String doSubtraction(String number1String, String number2String) {
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);
		
		double difference = number1 - number2;
		
		String result = "The Difference Total is " + difference;
		
		return result;
	}

	public String doMultiplication(String number1String, String number2String) {
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);
		
		double product = number1 * number2;
		
		String result = "The Product Total is " + product;
		
		return result;
	}

	public String doDivision(String number1String, String number2String) {
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);
		
		double quotient = number1 / number2;
		
		String result = "The Quotient Total is " + quotient; 
		
		return result;
	}
	
}
