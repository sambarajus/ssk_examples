package com.ssk.examples.others;

public class LargestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		largestPalindrome("itopinonavevanonipoti");
		System.out.println(isPalindrom("itopinonavevanonipoti"));
		
	}
	
	public static boolean isPalindrom(String str){
	
		int length = str.length();
		for(int i=0; i<(length/2)+1; i++){
			if(str.charAt(i)!=str.charAt(length-i-1)){
				return false;
			}
		}
		return true;
	}
	
	
	public static void largestPalindrome(String str){
		int n = str.length();
		boolean flag = false;
		String palString = null;
		for(int i = 0; i<n-4;i++){
			
			if(isPalindrom(str.substring(i,i+3))){
				flag = true;
				palString = str.substring(i,i+3);
			}else if(isPalindrom(str.substring(i,i+4))){
				flag = true;
				palString = str.substring(i,i+4);
			}else{
				flag = false;
			}
			
			if(flag){
				int start = i;
				int end = i+palString.length()-1;
				while(start>0 && end<n){
					if(str.charAt(start-1)==str.charAt(end+1)){
						start--;
						end++;
					}else{
						palString = str.substring(start,end);
						break;
						
					}
					
				}
				System.out.println(str.substring(start, end));
			}
			
		}
	}

}
