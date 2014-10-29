package com.ssk.samples.mvntest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueTest {

	public void firstUniquChar(char[] arr){
		char firstUnique=arr[0];
		for(int i=0;i<arr.length;i++){
			firstUnique = arr[i];
			boolean unique = false;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					unique = false;
					break;
				}else{
					unique = true;
				}
			}
			if(unique){
				break;
			}
			
		}
		System.out.println(firstUnique);
		
	}

	public static void uniqueTest(char[] arr){
		
		ArrayList<Character> unique = new ArrayList<Character>();
		Set<Character> visited = new HashSet<Character>();
		for(int i= arr.length-1;i>=0;i--){
			
			if(visited.contains(arr[i]))
				{
				if(unique.contains(arr[i]))
					unique.remove(unique.indexOf(arr[i]));
				continue;
				}
			
			unique.add(arr[i]);
			visited.add(arr[i]);
		}
		if(unique.size()==0)
			System.out.println("No Character Found");
		else
		System.out.println(unique.get(unique.size()-1));
	}
	
	
	public static void main(String args[]){
		UniqueTest test = new UniqueTest();
		
//		test.firstUniquChar("resources".toCharArray());
		uniqueTest("cclass".toCharArray());
	}
	
}
