package com.kdev.labs.calculator;

import java.math.BigDecimal;

public class Calculator {
	
	private static final int DEFAULT_PRECISENESS = 4;
	private final int preciseness = DEFAULT_PRECISENESS;
	
	public BigDecimal calculate(String mathExpr) {
		BigDecimal result = new BigDecimal(0);
		MathExpression expression = parseExpression(mathExpr);
		
		return result;
	}
	
	private MathExpression parseExpression(String mathExpr) {
		return null;
	}

}
