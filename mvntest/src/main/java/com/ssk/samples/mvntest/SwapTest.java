package com.ssk.samples.mvntest;

public class SwapTest {

	
	public static void main(String args[])
	{
		SwapTest t = new  SwapTest();
		t.swapInts(10, 6);
	}
	public void swapInts(int a, int b){
		System.out.println("a : "+a+", b: "+b);
		a=a+b;
		System.out.println("a : "+a+", b: "+b);
		b=a-b;
		System.out.println("a : "+a+", b: "+b);
		a=a-b;
		System.out.println("a : "+a+", b: "+b);
	}
}
