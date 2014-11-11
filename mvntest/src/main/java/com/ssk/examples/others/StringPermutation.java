package com.ssk.examples.others;

public class StringPermutation {
    
    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String input = "ABT";
        permutation(input, "");
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
    
}