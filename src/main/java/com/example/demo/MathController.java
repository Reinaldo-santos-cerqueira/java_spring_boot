package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.converters.NumberConverter;
import com.example.demo.exceptions.UnsuppportedMathOperationException;
import com.example.demo.utils.Operation;

@RestController
public class MathController {
	
	@RequestMapping("/sum/{numberOne}/{numberTwo}")
	public Double Sum(
		@PathVariable(value="numberOne") String numberOne,
		@PathVariable(value="numberTwo") String numberTwo
	) throws Exception{
		
		if( !NumberConverter.isNumeric(numberOne) ||  !NumberConverter.isNumeric(numberTwo) ) {
			
			throw new UnsuppportedMathOperationException("Só aceita numerico");
			
		}
		
		return Operation.operations(NumberConverter.convertDouble(numberOne),"sum",NumberConverter.convertDouble(numberTwo));
	}
	
	@RequestMapping("/sub/{numberOne}/{numberTwo}")
	public Double Sub(
		@PathVariable(value="numberOne") String numberOne,
		@PathVariable(value="numberTwo") String numberTwo
	) throws Exception{
		
		if( !NumberConverter.isNumeric(numberOne) ||  !NumberConverter.isNumeric(numberTwo) ) {
			
			throw new UnsuppportedMathOperationException("Só aceita numerico");
			
		}
		
		return Operation.operations(NumberConverter.convertDouble(numberOne),"sub",NumberConverter.convertDouble(numberTwo));
	}
	
	@RequestMapping("/div/{numberOne}/{numberTwo}")
	public Double Div(
		@PathVariable(value="numberOne") String numberOne,
		@PathVariable(value="numberTwo") String numberTwo
	) throws Exception{
		
		if( !NumberConverter.isNumeric(numberOne) ||  !NumberConverter.isNumeric(numberTwo) ) {
			
			throw new UnsuppportedMathOperationException("Só aceita numerico");
			
		}
		
		return Operation.operations(NumberConverter.convertDouble(numberOne),"div",NumberConverter.convertDouble(numberTwo));
	}
	
	@RequestMapping("/mul/{numberOne}/{numberTwo}")
	public Double Mul(
		@PathVariable(value="numberOne") String numberOne,
		@PathVariable(value="numberTwo") String numberTwo
	) throws Exception{
		
		if( !NumberConverter.isNumeric(numberOne) ||  !NumberConverter.isNumeric(numberTwo) ) {
			
			throw new UnsuppportedMathOperationException("Só aceita numerico");
			
		}
		
		return Operation.operations(NumberConverter.convertDouble(numberOne),"mul",NumberConverter.convertDouble(numberTwo));
	}
	
	@RequestMapping("/rest/{numberOne}/{numberTwo}")
	public Double Rest(
		@PathVariable(value="numberOne") String numberOne,
		@PathVariable(value="numberTwo") String numberTwo
	) throws Exception{
		
		if( !NumberConverter.isNumeric(numberOne) ||  !NumberConverter.isNumeric(numberTwo) ) {
			
			throw new UnsuppportedMathOperationException("Só aceita numerico");
			
		}
		
		return Operation.operations(NumberConverter.convertDouble(numberOne),"res",NumberConverter.convertDouble(numberTwo));
	}
	
	@RequestMapping("/sqrt/{numberOne}")
	public Double SquareRoot(
		@PathVariable(value="numberOne") String numberOne
	) throws Exception{
		
		if( !NumberConverter.isNumeric(numberOne) ) {
			
			throw new UnsuppportedMathOperationException("Só aceita numerico");
			
		}
		
		return Operation.operations(NumberConverter.convertDouble(numberOne),"sqrt",0.00);
	}

	
}