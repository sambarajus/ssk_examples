package com.ssk.samples.mvntest;

public class PowerTest {
	
	public static void main(String args[]){
		PowerTest t = new PowerTest();
		System.out.println(t.getPower(1024));
	}
	
	public int getPower(int num){
		int n = 0;
		while(num%2!=1){
			num=num/2;
			n++;
		}
		return n;
	}

}
