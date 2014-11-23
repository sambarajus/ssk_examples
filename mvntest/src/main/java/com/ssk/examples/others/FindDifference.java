/**
 * 
 */
package com.ssk.examples.others;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author sskumar
 * 
 */
public class FindDifference {

	public static void printDifference() {
		InputStream stream = System.in;
		Scanner scanner = new Scanner(stream);
		int prev = 0;
		int current = 0;
		String line = null;
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			if(line.equalsIgnoreCase("quit"))
				break;
			int val = Integer.parseInt(line);
			if (prev != 0) {
				if (prev > val) {
					System.out.println(prev - val);
				} else {
					System.out.println(val - prev);
				}
			} else {

			}
			prev = val;
		}

	}

	public static void main(String args[]) {
		printDifference();
	}
}
