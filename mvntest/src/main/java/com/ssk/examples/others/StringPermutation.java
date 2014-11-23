package com.ssk.examples.others;

public class StringPermutation {
    
    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String input = "ABT";
//        permutation(input, "");
        permute("ABT".toCharArray(),0,3);
    }
    
    private static void permutation(String input, String sofar) {
        // TODO Auto-generated method stub
        
        if (input.equals("")) {
            System.out.printf("%s,", sofar);
        }
        for (int i = 0; i< input.length(); i++) {
            char c = input.charAt(i);
            if (input.indexOf(c, i + 1) != -1)
            continue;
            permutation(input.substring(0, i) + input.substring(i + 1), sofar+c);
        }
    }
    

    private static void permute(char[] input, int start, int length) {
    	if (start==length) {
            System.out.println(input);
        }else{
        	for (int i = start; i< input.length; i++) {
               swap(input,i,start);
               permute(input,start+1,length);
               swap(input,i,start);
            }
        }
    }
    
    private static void swap(char[] a, int start, int end){
    	char temp = a[start];
    	a[start] = a[end];
    	a[end] = temp;
    }

    
}