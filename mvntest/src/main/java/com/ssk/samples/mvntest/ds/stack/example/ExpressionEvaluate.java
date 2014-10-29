package com.ssk.samples.mvntest.ds.stack.example;

import com.ssk.samples.mvntest.ds.stack.LinkedStack;

public class ExpressionEvaluate {

	public static int evaluate(String expression) {

		LinkedStack<Character> ops = new LinkedStack<Character>();
		LinkedStack<Double> vals = new LinkedStack<Double>();
		Double val = null;
		char[] chars = expression.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];

			if (c == '(' || c==' ') ;
				
			else if (c == '*' || c == '+' || c == '-' || c == '/' || c == '%')
					ops.push(c);
				else if (c == ')') {
					char op = ops.pop();
					Double v = vals.pop();
					if (op == '*')
						v = vals.pop() * v;
					else if (op == '+')
						v = vals.pop() + v;
					else if (op == '-')
						v = vals.pop() - v;
					else if (op == '/')
						v = vals.pop() / v;
					else if (op == '%')
						v = vals.pop() % v;
					vals.push(v);
				} else {
					vals.push(Double.parseDouble(String.valueOf(c)));
				}
		}
		val = vals.pop();
		return val.intValue();
	}

	
	public static void main(String args[]){
		System.out.println(evaluate("(1+((2+3)*(4*5)))"));
	}
}
