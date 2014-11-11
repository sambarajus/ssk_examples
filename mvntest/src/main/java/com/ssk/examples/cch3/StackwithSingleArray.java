package com.ssk.examples.cch3;

public class StackwithSingleArray {

	int stackSize = 100;
	int stackArray[] = new int[stackSize*3];
	int[] stackPointer = {0,0,0};
		
	public void push(int stackNum, int value){
	
		int topIndex = stackNum*stackSize + stackPointer[stackNum] + 1;;
		stackPointer[stackNum]++;
		stackArray[topIndex] = value;
	
	}
	public int pop(int stackNum){
		
		int value = stackArray[stackPointer[stackNum]];
		stackArray[stackPointer[stackNum]] = 0; 
		stackPointer[stackNum]--;
		return value;
	}
	
	
}
