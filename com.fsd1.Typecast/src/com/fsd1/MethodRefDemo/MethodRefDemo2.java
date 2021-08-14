package com.fsd1.MethodRefDemo;

import java.util.function.IntBinaryOperator;

public class MethodRefDemo2 {

	public static void main(String[] args) {
		
		MethodRefDemo2 m2 = new MethodRefDemo2();
		
		// calling the static method using reference operator
		m2.operation( MethodRefDemo2 :: multiply, 22, 22);
		
		// calling a non static method using reference operator
		m2.operation(m2::add, 150, 25);
		
	}
	
	public static int multiply(int x, int y) {
		return x * y ;
		
	}
	
	public int add ( int x, int y) {
	
		return x + y ;
	}
		
	
	public void operation(IntBinaryOperator operator, int a, int b) {
		System.out.println(operator.applyAsInt(a, b));
		
	}

	
	
}






