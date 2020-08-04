package com.calculator.service;

import java.lang.Math;

public class calService {
	
	// Add
	public double addNumber(double a,double b) {
		return a + b;
	}
	
	// Sub
	public double subNumber(double a , double b) {
		return a - b;
	}
	
	// Div
	public double divNumber(double a , double b) {
		return a / b;
	}
	
	// Mul 
	public double mulNumber(double a , double b) {
		return a * b;
	}
	
	// SQRT
	public double sqrt(double a) {
		return Math.sqrt(a);
	}
	
}
