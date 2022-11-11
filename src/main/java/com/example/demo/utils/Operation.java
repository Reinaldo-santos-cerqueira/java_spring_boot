package com.example.demo.utils;

public class Operation {
	
	public static Double operations( Double numberOne ,String operation, Double numberTwo ) {
		
		double resultado = 0;
		
		switch(operation) {
		
			case "sum" :
				resultado = numberOne + numberTwo;
				break;
				
			case "sub":
				resultado = numberOne - numberTwo;
				break;
			case "mul":
				resultado = numberOne * numberTwo;
				break;
			case "div":
				resultado = numberOne / numberTwo;
				break;
			case "res":
				resultado = numberOne % numberTwo;
				break;
			case "sqrt":
				resultado = Math.sqrt(numberOne);
				break;
			default:
				resultado = 0;
				break;
		}
	
		return resultado;
		
	}
}