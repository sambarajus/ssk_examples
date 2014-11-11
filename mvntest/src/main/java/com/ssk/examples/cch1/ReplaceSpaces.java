package com.ssk.examples.cch1;
/**
 * 
 * @author shravans
 * Question 1.4 in Cracking Coding Interview
 */
public class ReplaceSpaces {

	public String replaceString(char[] strArr,int length){
		int spaceCount = 0;
		for(int i=0;i<length;i++)
		{
			if (strArr[i]==' ')
				spaceCount++;
		}
		System.out.println(strArr.length);
		int newLength = length+(spaceCount*2);
		System.out.println(newLength);
//		strArr[newLength-1]='\0';
		for(int i = length-1; i>=0;i--){
			if(strArr[i]==' '){
				strArr[newLength-1]='0';
				strArr[newLength-2]='2';
				strArr[newLength-3]='%';
				newLength = newLength-3;
			}else{
				strArr[newLength-1] = strArr[i];
				newLength = newLength-1;
			}
		}
		return new String(strArr).toString();
	}
	
	public static void main(String args[]){
		ReplaceSpaces spaces = new ReplaceSpaces();
		System.out.println(spaces.replaceString(new char[]{'h','e','l','l','o',' ','w','o','r','l','d',' ',' '},11));
	}
}
