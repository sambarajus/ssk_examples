package com.ssk.samples.mvntest;

public class StringReplaceTest {
	
	public static void main(String[] args) {
		StringReplaceTest t = new StringReplaceTest();
//		t.replaceString();
		System.out.println(t.countChars("aabddddddfff"));
	}
	
	public void replaceString(){
		String str = new String("My John Smith    ");
		char[] strArr = {'M','y',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' '};
		System.out.println(strArr.length);
		int length = 13;
		int spaceCount = 0;
		for(int i = 0; i<length;i++){
			if(strArr[i]==' ')
				spaceCount++;
		}
		int newLength = length+spaceCount*2;
		System.out.println(newLength);
		strArr[newLength-1] = '\0';
		
		System.out.println(strArr.length);
		
		for(int i=length-1;i>=0;i--){
			if(strArr[i]==' '){
				strArr[newLength -1 ]='0';
				strArr[newLength -2 ]='2';
				strArr[newLength -3 ]='%';
				newLength = newLength-3;
			}
			else{
				strArr[newLength-1] = strArr[i];
				newLength = newLength-1;
			}
		}
		
		System.out.println(strArr);
	}

	
	public String countChars(String str){
		String newStr = "";
		int count = 1;
		char lastChar = str.charAt(0);
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==lastChar){
				count++;
			}else{
				newStr = newStr+lastChar+count;
				lastChar = str.charAt(i);
				count = 1;
			}
		}
		return newStr+lastChar+count;
	}
	
}
